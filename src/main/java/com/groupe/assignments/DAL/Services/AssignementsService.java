package com.groupe.assignments.DAL.Services;

import com.groupe.assignments.DAL.Repository.AssignementsRepository;
import com.groupe.assignments.Model.Assignements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignementsService {

    @Autowired
    private AssignementsRepository assignementsRepository;

    public Assignements createAssignements(Assignements assignements){
        return assignementsRepository.save(assignements);
    }

    public List<Assignements> readAssignements(){
        return assignementsRepository.findAll();
    }

    //TODO get raha fatatra ny id
    //TODO put -> update
    //TODO delete

    public String deleteAssignements(int id){
        Assignements assignementsToDelete = assignementsRepository.findById(id).orElse(null);
        assignementsRepository.delete(assignementsToDelete);
        return "Assignements " + id + " effacé";
    }

    public Assignements readAssignement(int id){
        return assignementsRepository.findById(id).orElse(null);
    }

    public Assignements updateAssignements(Assignements assignements){
        int id = assignements.getId();
        Assignements assignementsToUpdate = assignementsRepository.findById(id).orElse(null);

        assignementsToUpdate.setNom(assignements.getNom());
        assignementsToUpdate.setDescription(assignements.getDescription());
        assignementsToUpdate.setNomExecutant(assignements.getNomExecutant());
        assignementsToUpdate.setRendu(assignements.isRendu());

        return assignementsRepository.save(assignementsToUpdate);
    }
}
