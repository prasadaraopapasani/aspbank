package com.asp.bank.registration.controller;

import com.asp.bank.registration.model.RegistrationRequestVO;
import com.asp.bank.registration.service.RegistrationAuthenticationService;
import com.asp.bank.model.BaseResponseVO;
import com.asp.bank.registration.model.AuthenticationRequestVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/bank")
public class RegistrationAuthenticationController {

    private RegistrationAuthenticationService registrationAuthenticationService;

    @PostMapping("/login")
    public BaseResponseVO login(AuthenticationRequestVO authenticationRequestVO) {
        return registrationAuthenticationService.authenticateUser(authenticationRequestVO);
    }

    @PostMapping("/register")
    public BaseResponseVO register(RegistrationRequestVO registrationRequestVO) {
        return registrationAuthenticationService.registerUser(registrationRequestVO);
    }

}
