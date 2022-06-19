package com.example.studentexamportal.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course extends Base{
    private String name;
    private int courseCode;
    private int courseUnit;

    @ManyToOne
    private Department Department;

}
