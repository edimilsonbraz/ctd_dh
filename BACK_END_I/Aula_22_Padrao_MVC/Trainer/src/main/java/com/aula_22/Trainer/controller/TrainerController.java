package com.aula_22.Trainer.controller;

import com.aula_22.Trainer.model.Trainer;
import com.aula_22.Trainer.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

    private final TrainerService trainerService;

    //Conecção entre a Model e a Controller
    @Autowired
    public TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    @GetMapping
    public List<Trainer> getTrainer(){
        return trainerService.listTrainer();
    }
}
