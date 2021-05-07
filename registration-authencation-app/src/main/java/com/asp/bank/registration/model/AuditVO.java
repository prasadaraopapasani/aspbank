package com.asp.bank.registration.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@MappedSuperclass
public class AuditVO implements Serializable {

    @CreatedBy
    protected String createBy;
    @CreatedDate
    protected Date createdDate;
    @LastModifiedBy
    protected String modifiedBy;
    @LastModifiedDate
    protected Date modifiedDate;
    


    
}
