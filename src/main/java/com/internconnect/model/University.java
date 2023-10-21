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
@Table(name = "university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "university_code")
    private String universityCode;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "university_id", referencedColumnName = "id")
    List< Student > students = new ArrayList< >();

    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "login_user_id", referencedColumnName = "id")
    //List< Student > students = new ArrayList< >();
}
