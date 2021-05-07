package com.asp.bank.registration.model;

import com.asp.bank.model.BaseVO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LoginVO extends BaseVO {

    private String userId;
    private String password;

}
