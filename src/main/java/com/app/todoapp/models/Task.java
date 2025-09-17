package com.app.todoapp.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

//the elements here will be the columns
@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //with the above two annotations JPA knows that id is an id field and that it needs to be automatically generated
    private long id;
    private String title;
    private boolean completed;

}
