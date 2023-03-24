package iut.accountManager.accManager;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class accountAdvice {
    @ResponseBody
    @ExceptionHandler(AccountException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String AccountHandler(AccountException exp){
        return exp.getMessage();
    }
    
}
