package com.groupe.assignments.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Assignements {

    @Id
    @GeneratedValue
    private Integer id;

    private String nom;
    private String description;
    private String nomExecutant;
    private boolean rendu;
}
