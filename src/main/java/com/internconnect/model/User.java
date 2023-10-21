package com.internconnect.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;
import org.apache.logging.log4j.message.Message;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Setter
@Getter
@ToString
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "Name should not be null")
    private String name;
    @NotNull(message = "Age should not be null")
    private String age;

    private String address;
    @Email(message = "Please enter the valid email address")
    private String email;

    //@CreationTimestamp
    //@Column(name = "created_at", nullable = false, updatable = false)
    //private Date createdAt;

    //@UpdateTimestamp
    //@Column(name = "update_at", nullable = false, updatable = false)
    //private Date updateAt;

}
