package com.asp.bank.registration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@ToString
@Entity
@Table(name = "addressinfo")
public class AddressVO  extends AuditVO{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;
    @Column(length = 50,nullable = false)
    private String addressLine1;
    @Column(length = 50,nullable = true)
    private String addlessLine2;
    @Column(length = 10,nullable = false)
    private String addressType;
    @Column(length = 20,nullable = false)
    private String city;
    @Column(length = 20,nullable = false)
    private String state;
    @Column(length = 20,nullable = false)
    private String country;
    @Column(length = 10,nullable = false)
    private String zipCode;

}
