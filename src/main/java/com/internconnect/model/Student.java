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
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "std_id")
    private String std_id;
    @Column(name = "name")
    private String name;
    @Column(name = "std_email")
    private String std_email;
    @Column(name = "std_phone")
    private String std_phone;
    @Column(name = "university")
    private String university;
    @Column(name = "focus_area")
    private String focus_area;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    //@Lob
    //private byte[] cv;


    //@ManyToOne
    //@JoinColumn(name = "student_id", referencedColumnName = "id")
    //List<University> university = new ArrayList< >();


    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "university_id", referencedColumnName = "id")
    //List < Comment > comments = new ArrayList < > ();
}
