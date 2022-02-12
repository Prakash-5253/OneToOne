package com.example.demoForOneToOne.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;
import java.util.List;

    @Data
    @Entity
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name="student_table")
    public class Student {
        @Id
        @GeneratedValue(generator = "uuid2")
        @GenericGenerator(name = "uuid2", strategy = "uuid2")
        // @Column(name = "stud_id")
        private String studentId;
        private String studentName;
        private int age;
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "fk_id")
        @JsonIgnore
        //private Sports sports;
        private Address address;
    }



