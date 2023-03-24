package iut.accountManager.accManager;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // repo
@Data //lombok
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @Column(name="risk") // de base le nom du field
    public boolean risk;
    @Column(name="balance")
    public Double balance;
    public Account() {
    }

    public Account(Boolean risk,Double somme){
        this.balance = somme;
        this.risk = risk;
    }

    public boolean getRisk() {
        return risk;
    }

    public void setRisk(boolean risk) {
        this.risk = risk;
    }

    public Double getSomme() {
        return balance;
    }

    public void setSomme(Double somme) {
        this.balance = somme;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
