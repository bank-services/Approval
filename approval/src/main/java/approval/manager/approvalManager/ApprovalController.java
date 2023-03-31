/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package approval.manager.approvalManager;

import java.util.List;
import Model.Approval;
import Model.ApprovalException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
     * @param app
     * @return
     */
    @RequestMapping(value = "/post", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Approval putApproval(@RequestBody Approval app)
    {
        this.repository.save(app);
        return app;
    }
    
    @RequestMapping(value="/approvals/approval/{id}",method= RequestMethod.DELETE)
    public @ResponseBody Approval deleteApproval(@PathVariable int id){
        for(Approval app : repository.findAll()){
            if(app.getId() == id){
                Approval tmp = app;
                repository.delete(app);
                return tmp;
            }
        }
        throw new ApprovalException("Wrong approval ID : "+id);
    }
    
    
    @RequestMapping(value = "/approvals/approval/{id}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String getApproval(@PathVariable Long id)
    {
        for(Approval app : repository.findAll()) {
           if(app.getId().equals(id)){
               return app.getApproval();
           }
       }
       throw new ApprovalException("Wrong approval ID : "+id);
    }
}