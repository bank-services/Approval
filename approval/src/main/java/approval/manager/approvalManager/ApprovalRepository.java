package approval.manager.approvalManager;




import Model.Approval;
import Model.Approval;
import jakarta.persistence.Entity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprovalRepository extends CrudRepository<Approval, Long> {
        @Override
        List<Approval> findAll();
}