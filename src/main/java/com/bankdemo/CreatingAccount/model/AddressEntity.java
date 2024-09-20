package com.bankdemo.CreatingAccount.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "address",schema = "bank")
public class AddressEntity {
    public AddressEntity(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer id;


    @Column(name = "state")
    public String state;

    @ManyToOne
    @JoinColumn(name = "adharnumber",referencedColumnName = "adharnumber")
    public AdharEntity myMappedByTestEntity;


}
