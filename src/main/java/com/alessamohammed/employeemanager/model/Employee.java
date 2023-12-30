package com.alessamohammed.employeemanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String jobTitle;
    @Getter
    @Setter
    private String phone;
    @Getter
    @Setter
    private String imageUrl;
    @Getter
    @Setter
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    @Override
    public String toString() {
        return "Employee{"+
                "id=" + id +
                ", name='" + name +'\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}


