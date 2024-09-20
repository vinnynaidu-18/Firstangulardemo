package com.bankdemo.CreatingAccount.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Address {
    private String add1;
    private String add2;
    private String city;
    private String state;
    private String pincode;

}
