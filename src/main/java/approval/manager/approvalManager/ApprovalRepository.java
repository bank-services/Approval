package approval.manager.approvalManager;


import Model.Approval;
import jakarta.persistence.Entity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprovalRepository extends CrudRepository<Approval, Long> {
        @Override
        Optional<Approval> findById(Long id);
        List<Approval> findByAccount(Long id);
        @Override
        List<Approval> findAll();
        void save(Entity app);
}