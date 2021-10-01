package com.batchproject.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Admin {

    @Id
    @GeneratedValue
    private Integer ID;
    private String userName;
    private String password;
    private String role;

}
