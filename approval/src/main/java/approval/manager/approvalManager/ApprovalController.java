/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package approval.manager.approvalManager;

import java.util.List;
import Model.Approval;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author aurian
 */
@RestController
@RequestMapping("/")
public class ApprovalController {
    
    //@Autowired
    private final ApprovalRepository repository;
    
    public ApprovalController(ApprovalRepository repository)
    {
        this.repository = repository;
    }
    
    
    @RequestMapping("/approvals")
    public @ResponseBody List<Approval> getAllApprovals()    
    {
        return this.repository.findAll();
    }
    
    /**
     *
     * @param id
     * @param account
     * @param amount
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.POST,produces = "application/json")
    public @ResponseBody Approval putApproval(@PathVariable Long id,@RequestParam int account,@RequestParam int amount )
    {
        Approval ap = new Approval(id,account,amount);
        this.repository.save(ap);
        return ap;
    }
    
    @RequestMapping(value = "/approvals/approval/{id}", method = RequestMethod.GET,produces = "application/json")
    public @ResponseBody Approval getApproval(@PathVariable Long id)
    {
        return this.repository.findById(id).orElse(Approval(0,0,0));
    }
}