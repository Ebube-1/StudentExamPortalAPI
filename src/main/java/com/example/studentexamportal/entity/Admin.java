package com.example.studentexamportal.entity;

import com.example.studentexamportal.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin extends Base{
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Role role;
}
