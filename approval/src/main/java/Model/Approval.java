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
    public Long id;
@Column(name="account")
    public int account;
@Column(name="amount")
    public int amount;
    
    public Approval()
    {
        id = 000L;
        account = 000;
        amount = 0;
    }
    
    public Approval(Long id,int account,int balance)
    {
        this.id = id;
        this.account = account;
        this.amount=balance;
    }
}
