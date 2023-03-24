/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package approval.manager.approvalManager;

import java.util.List;
import org.springframework.stereotype.Controller;
import Model.Approval;
import Model.ApprovalRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author aurian
 */
@Controller
@RequestMapping("/")
public class ApprovalController {
    
    private final ApprovalRepository repository;
    
    ApprovalController(ApprovalRepository repo)
    {
        this.repository = repo;
    }
    
    
    @RequestMapping("/approvals")
    public @ResponseBody List<Approval> getAllApprovals()    
    {
        return this.repository.findAll();
    }
}
