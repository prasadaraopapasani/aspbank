package com.asp.bank.registration.service.impl;

import java.time.LocalDate;
import com.asp.bank.model.BaseRequestVO;
import com.asp.bank.model.BaseResponseVO;
import com.asp.bank.model.StatusVO;
import com.asp.bank.registration.model.UserRegistrationVO;
import com.asp.bank.registration.repository.RegistrationAuthencationRepository;
import com.asp.bank.registration.repository.UserRegistrationRepository;
import com.asp.bank.registration.service.RegistrationAuthenticationService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import lombok.AllArgsConstructor;

@Service("registrationAuthenticationService")
@AllArgsConstructor
public class RegistrationAuthenticationServiceImpl implements RegistrationAuthenticationService {

    private RegistrationAuthencationRepository registrationAuthencationRepository;
    
    @Override
    public BaseResponseVO registerUser(BaseRequestVO baseRequestVO) {
       
       UserRegistrationVO userVo=UserRegistrationVO.builder()
             .userId("papasani.java@gmail.com")
             .password( Base64Utils.encodeToUrlSafeString("java".getBytes()))
             .dob(LocalDate.now())
             .firstName("prasa")
             .lastName("papasni")
             .gender("Male")
             .build();
             String status =registrationAuthencationRepository.findByUserId(userVo.getUserId()).isPresent()?"user alread registed":  registrationAuthencationRepository.save(userVo).getUserId().concat(" Registed");
        return BaseResponseVO.builder().statusVO(StatusVO.builder().statusCode(HttpStatus.OK.value()).build()).build();
    }

    @Override
    public BaseResponseVO authenticateUser(BaseRequestVO baseRequestVO) {
        //autheticationRepository.findByUserIdAndPassword("papasani.java@gmail.com", Base64Utils.encodeToUrlSafeString("java".getBytes())).isPresent()?"athenticated": "unathenticated";
        registrationAuthencationRepository.findByUserIdAndPassword("papasani.java@gmail.com", Base64Utils.encodeToUrlSafeString("java".getBytes()));
        return BaseResponseVO.builder().statusVO(StatusVO.builder().statusCode(HttpStatus.OK.value()).build()).build();
    }
    
}
