package com.internconnect.model;

import jakarta.persistence.*;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@ToString
@Entity
@Table(name = "lecturer")
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "lec_id")
    private String lec_id;
    @Column(name = "name")
    private String name;
    @Column(name = "lec_email")
    private String lec_email;
    @Column(name = "lec_phone")
    private String lec_phone;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public void setId(Integer id) {
    }
}