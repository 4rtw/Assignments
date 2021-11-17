package com.groupe.assignments.Controller;

import com.groupe.assignments.DAL.Services.AssignementsService;
import com.groupe.assignments.Model.Assignements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AssignementsController {

    @Autowired
    private AssignementsService assignementsService;

    @PostMapping("/assignements")
    public Assignements createAssignements(@RequestBody Assignements assignements){
        return assignementsService.createAssignements(assignements);
    }

    @GetMapping("/assignements")
    public List<Assignements> readAssignements(){
        return assignementsService.readAssignements();
    }

    //TODO get raha fatatra ny id
    //TODO put -> update
    //TODO delete

    @GetMapping("/assignements/{id}")
    public Assignements readAssignements(@PathVariable int id){
        return assignementsService.readAssignement(id);
    }

    @PutMapping("/assignements")
    public Assignements updateAssignements(@RequestBody Assignements assignements){
        return assignementsService.updateAssignements(assignements);
    }

    @DeleteMapping("/assignements/{id}")
    public String deleteAssignements(@PathVariable int id){
        return assignementsService.deleteAssignements(id);
    }
}
