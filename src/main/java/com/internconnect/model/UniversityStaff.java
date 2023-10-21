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
@Table(name = "university_staff")
public class UniversityStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "staff_id")
    private String staffId;
    @Column(name = "type")
    private String type;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_no")
    private String phoneNo;


    //@Lob
    //private byte[] cv;


    //@ManyToOne
    //@JoinColumn(name = "student_id", referencedColumnName = "id")
    //List<University> university = new ArrayList< >();


    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "university_id", referencedColumnName = "id")
    //List < Comment > comments = new ArrayList < > ();
}
