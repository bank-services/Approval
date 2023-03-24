package Model;


import Model.Approval;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aurian
 */
@Repository
public interface ApprovalRepository extends CrudRepository<Approval, Long> {
        Approval findById(int id);
        List<Approval> findByAccount_Id(int id);
        @Override
        List<Approval> findAll();
}
