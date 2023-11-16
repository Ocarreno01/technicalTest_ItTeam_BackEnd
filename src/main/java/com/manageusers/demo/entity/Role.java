package com.manageusers.demo.entity;
import javax.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Getters y Setters para 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getters y Setters para 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
