package com.asp.bank.registration.service;

import com.asp.bank.model.BaseRequestVO;
import com.asp.bank.model.BaseResponseVO;

public interface RegistrationAuthenticationService {

    public BaseResponseVO registerUser(BaseRequestVO baseRequestVO);

    public BaseResponseVO authenticateUser(BaseRequestVO baseRequestVO);

}
