package org.learning.notes.infrastructure.entity;

import jdk.jfr.DataAmount;

import javax.persistence.*;
import org.hibernate.validator.constraints.Range;
import javax.validation.constraints.Email;

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

    @Email(message = "email not valid")
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
