package Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aurian
 */
@Entity
public class Approval {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(name="approved")
    private String approved;
    
    public Approval()
    {
        id = 000L;
        approved="unApproved";
    }
    
    public Approval(Long id,String approved)
    {
        this.id = id;
        this.approved = approved;
    }

    public Long getId() {
        return this.id;
    }

    public String getApproval() {
        return this.approved;
    }
}
