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
@Table(name = "vacancy")
public class Vacancy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "image")
    private String image;

    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "university_id", referencedColumnName = "id")
    //List< Student > students = new ArrayList< >();

    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "login_user_id", referencedColumnName = "id")
    //List< Student > students = new ArrayList< >();
}
