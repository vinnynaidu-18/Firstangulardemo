package com.bankdemo.CreatingAccount.controller;

import com.bankdemo.CreatingAccount.exception.AccountCreationFailedException;
import com.bankdemo.CreatingAccount.model.Account;
import com.bankdemo.CreatingAccount.service.AccountService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class AccountController {

   /* @PostMapping(value = "/api/createAccount",consumes = "application/json",
            produces = "application/json")
    public Account getAccountNumber(@RequestBody Account account) throws Exception {
        AccountService accountService=new AccountService();
        String accountNumber=accountService.createAccountUsingHibernate(account);
        account.setAccountNumber(accountNumber);
        return account;
    }*/
    @PostMapping(value = "/api/createAccount",consumes = "application/json",
            produces = "application/json")
    public Account getAccountNumber(@RequestBody Account account) throws Exception {
        AccountService accountService=new AccountService();
        String accountNumber=accountService.createAccUsingJpa(account);
        account.setAccountNumber(accountNumber);
        return account;
    }

   /*@GetMapping(value = "/api/searchAccount",consumes = "application/json",
            produces = "application/json")
    public Account getAccountNumber(@RequestHeader("accountinput") String accountNumber){
        System.out.println("hiii678967");
        AccountService accountService=new AccountService();
        System.out.println("hiii6789");
        return accountService.searchAccountByJPA(accountNumber);
    }*/
    @GetMapping(value = "/api/searchAccount",consumes = "application/json",
            produces = "application/json")
    public Account getAccountNumber(@RequestHeader("accountinput") String accountNumber){
        System.out.println("hiii678967");
        //List<String> accountNumberList= httpHeaders.get("accountinput");
        //String accountFromHttpHeaders=accountNumberList.get(0);
        AccountService accountService=new AccountService();
        System.out.println("hiii6789");
        return accountService.searchAccount(accountNumber);

    }
}
