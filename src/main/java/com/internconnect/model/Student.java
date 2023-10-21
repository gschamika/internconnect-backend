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
    @Column(name = "student_id")
    private String studentId;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "student_email")
    private String studentEmail;
    @Column(name = "phone_no")
    private String phoneNo;
    @Column(name = "focus_area")
    private String focusArea;
    private String status;

    //@Lob
    //private byte[] cv;


    //@ManyToOne
    //@JoinColumn(name = "student_id", referencedColumnName = "id")
    //List<University> university = new ArrayList< >();


    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "university_id", referencedColumnName = "id")
    //List < Comment > comments = new ArrayList < > ();
}
