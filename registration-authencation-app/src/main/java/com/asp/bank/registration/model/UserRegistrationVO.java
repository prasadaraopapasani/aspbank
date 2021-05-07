package com.asp.bank.registration.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "UserRegistration")
public class UserRegistrationVO extends AuditVO {

    @Id
    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dob;

}
