package com.shuttler.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@Document("manager")
public class Manager extends Person {
    @Id
    private String id;

    private Date signUpDate;
    private Date updateDate;
    private String institutionId;
    private Boolean active;
}
