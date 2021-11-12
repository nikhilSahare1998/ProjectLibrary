package com.neosoft.ProjectLabrary.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name ="student")
public class Users {

    @javax.persistence.Id
    @GeneratedValue()
    private Long Id;

    @Column(name = "firstName", nullable = false)
    private String name;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "mobileNumber", nullable = false)
    private int mobileNum;

    @Column(name ="email", nullable = false)
    private String email;

    @OneToMany(targetEntity = Project.class,  cascade = CascadeType.ALL)
    @JoinColumn(name = "stproId",referencedColumnName = "Id")
    private List<Project> projects;
}
