package com.example.studentexamportal.entity;


import com.example.studentexamportal.enums.Level;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department extends Base {
    private String name;
    private int DepartmentalCode;
//    private List<Level> level;

}

