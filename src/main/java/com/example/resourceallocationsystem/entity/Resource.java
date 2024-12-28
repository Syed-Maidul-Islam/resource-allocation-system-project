 ////package com.example.resourceallocationsystem.entity;  // Replace with your package
////
////public class Resource {
////    private int id;
////    private String name;
////    private int value;
////
////    // Constructor
////    public Resource(int id, String name, int value) {
////        this.id = id;
////        this.name = name;
////        this.value = value;
////    }
////
////    // Getters and Setters
////    public int getId() {
////        return id;
////    }
////
////    public void setId(int id) {
////        this.id = id;
////    }
////
////    public String getName() {
////        return name;
////    }
////
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    public int getValue() {
////        return value;
////    }
////
////    public void setValue(int value) {
////        this.value = value;
////    }
////}
//
//package com.example.resourceallocationsystem.entity;
//
//public class Resource {
//    private int id;
//    private String name;
//    private int value;
//
//    // Constructor
//    public Resource(int id, String name, int value) {
//        this.id = id;
//        this.name = name;
//        this.value = value;
//    }
//
//    // Getters and Setters
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//}


package com.example.resourceallocationsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "resource")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resource_id")
    private int id;

    @Column(name = "resource_name")
    private String name;

    @Column(name = "experience")
    private int value;

    @Column(name = "skills")
    private String skills;

    // Constructor
    public Resource() {}

    public Resource(int id, String name, int value, String skills) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.skills = skills;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
