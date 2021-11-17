package com.groupe.assignments.DAL.Repository;

import com.groupe.assignments.Model.Assignements;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignementsRepository extends JpaRepository<Assignements, Integer> {
}
