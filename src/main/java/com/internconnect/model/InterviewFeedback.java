package com.internconnect.model;

import jakarta.persistence.*;

import lombok.Data;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@ToString
@Entity
@Table(name = "interview_feedback")
public class InterviewFeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "status")
    private String status;
    @Column(name = "feedback")
    private String feedback;
    @Column(name = "created_date")
    private Date createdDate;

    //@Lob
    //private byte[] cv;


    //@ManyToOne
    //@JoinColumn(name = "student_id", referencedColumnName = "id")
    //List<University> university = new ArrayList< >();


    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "university_id", referencedColumnName = "id")
    //List < Comment > comments = new ArrayList < > ();
}
