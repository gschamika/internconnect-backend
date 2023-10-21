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
    private String businessRegNo;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "cantact_num")
    private String contactNo;

    private String status;

    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "university_id", referencedColumnName = "id")
    //List< Student > students = new ArrayList< >();

    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "login_user_id", referencedColumnName = "id")
    //List< Student > students = new ArrayList< >();
}
