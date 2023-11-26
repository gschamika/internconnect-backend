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
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "business_registration_no")
    private String business_registration_no;
    @Column(name = "com_address")
    private String com_address;
    @Column(name = "com_email")
    private String com_email;
    @Column(name = "com_phone")
    private String com_phone;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "university_id", referencedColumnName = "id")
    //List< Student > students = new ArrayList< >();

    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "login_user_id", referencedColumnName = "id")
    //List< Student > students = new ArrayList< >();
}
