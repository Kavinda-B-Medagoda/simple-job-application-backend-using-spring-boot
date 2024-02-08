package com.example.JobApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jobs")
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postID;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
}
