package com.example.studentexamportal.entity;

import com.example.studentexamportal.enums.Gender;
import com.example.studentexamportal.enums.Level;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student extends Base {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private String email;
    private String password;
    private String Department;
    private Level level;

    @OneToMany
    private List<Course> courses = new ArrayList<>();
    private double gradePoint;

}
