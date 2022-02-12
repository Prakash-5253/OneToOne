package com.example.demoForOneToOne.entity;




import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

    @Data
    @Entity
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name="Address_table")
    public class Address {
        @Id

        @GeneratedValue(generator = "uuid2")
        @GenericGenerator(name = "uuid2", strategy = "uuid2")
        public String addressId;
        public String  city;
        public String street;
        @OneToOne(mappedBy = "address")
        @JsonIgnore
        public Student student;
    }



