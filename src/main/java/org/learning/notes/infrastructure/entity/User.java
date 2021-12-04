package org.learning.notes.infrastructure.entity;

import jdk.jfr.DataAmount;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users", uniqueConstraints=
@UniqueConstraint(columnNames={"email"}))
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Email(message = "email not valid", unique = true)
    @Column(name = "email")
    private String email;

    @Range(min=8, message = "invalid password")
    @Column(name = "pswd")
    private String password;

    @Column(name = "created_time")
    private LocalDateTime createTime;

    @Column(name = "updated_time")
    private LocalDateTime updateTime;

}
