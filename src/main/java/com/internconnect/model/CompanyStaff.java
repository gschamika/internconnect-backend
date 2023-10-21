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
@Table(name = "company_staff")
public class CompanyStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "staff_id")
    private String studentId;
    @Column(name = "type")
    private String type;


    //@ManyToOne
    //@JoinColumn(name = "student_id", referencedColumnName = "id")
    //List<University> university = new ArrayList< >();


    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "university_id", referencedColumnName = "id")
    //List < Comment > comments = new ArrayList < > ();
}
