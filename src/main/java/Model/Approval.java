package Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aurian
 */
@Entity
@Data
public class Approval {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
@Column(name="account_id")
    private int account_id;
@Column(name="balance")
    private int balance;
    
    public Approval()
    {
        id = 000;
        account_id = 000;
        balance = 0;
    }
    
    public Approval(int id,int account,int balance)
    {
        this.id = id;
        this.account_id = account;
        this.balance=balance;
    }
}
