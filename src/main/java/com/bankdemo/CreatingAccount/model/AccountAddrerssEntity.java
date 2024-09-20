package com.bankdemo.CreatingAccount.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "address",schema = "bank")
@Data
public class AccountAddrerssEntity {

    public AccountAddrerssEntity(){

    }

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
@Column(name = "address1")
    private String add1;

@Column(name = "address2")
    private String add2;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "pincode")
    private String pincode;
    @Column(name = "status")
    private Integer status;

     @ManyToOne
     @JoinColumn(name = "accountnumber",
     referencedColumnName = "accountnumber")
    private AccountEntity accountEntity;

}
