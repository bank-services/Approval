package iut.accountManager.accManager;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class AccountController {
    @Autowired
    private AccountRepository repository;
    AccountController(AccountRepository repository) {
        this.repository = repository;
        this.repository.save(new Account(false, 0.0));
        this.repository.save(new Account(true, 100.0));
    }

    @PostMapping("/post")
    @ResponseBody public Account post(Account acc){
        this.repository.save(acc);
        return acc;
    }

    @GetMapping(value="/accounts",  produces = "application/json")
    public @ResponseBody List<Account> accounts(){
        return repository.findAll();
    }

    @GetMapping("/account/{id}")
    @ResponseBody public Account getAccount(@PathVariable Long id) throws Exception{
        try {
            return this.repository.findById(id);
        } catch (Exception e) {
            throw new Exception("Unfound account");
        }
    }
    @PostMapping(value = "/accounts", headers = "Accept=application/json")
    public @ResponseBody Account addAccounts(@RequestBody Account acc){
        repository.save(acc);
        return acc;
    }
}
