package com.asp.bank.registration.repository;

import java.util.Optional;
import com.asp.bank.registration.model.UserRegistrationVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationAuthencationRepository extends JpaRepository<UserRegistrationVO,String> {
    
    public Optional<UserRegistrationVO> findByUserIdAndPassword(String userId,String password);
    public Optional<UserRegistrationVO> findByUserId(String userId);
    
}
