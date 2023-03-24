/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package approval.manager.approvalManager;

import java.util.List;
import Model.Approval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
