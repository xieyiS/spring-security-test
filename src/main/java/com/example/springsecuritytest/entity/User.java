package com.example.springsecuritytest.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: xieyi
 * @create: 2021/9/27 16:00
 * @conent:
 */
@Entity
@Data
@Table(name="user")
public class User implements Serializable {
    @Id
    @Column
    private Long id;
    @Column
    private String login;
    @Column
    private String password;
    @Column
    private String role;
}

