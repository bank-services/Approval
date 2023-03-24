package approval.manager.approvalManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("Model")
@EnableJpaRepositories
@SpringBootApplication
public class ApprovalManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApprovalManagerApplication.class, args);
	}

}
