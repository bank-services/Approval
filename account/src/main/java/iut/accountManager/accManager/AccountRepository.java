package iut.accountManager.accManager;

import org.springframework.stereotype.Repository;

import jakarta.persistence.Entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Integer> {
    Account findById(Long id);
    List<Account> findAll();
    void save(Entity account);
}
