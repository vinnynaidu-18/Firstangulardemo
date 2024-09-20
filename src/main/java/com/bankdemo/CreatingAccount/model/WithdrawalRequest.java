package com.bankdemo.CreatingAccount.model;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class WithdrawalRequest {
    private String accountNumber;
    private double amount;
}
