package com.aula_22.Trainer.service.impl;

import com.aula_22.Trainer.model.Trainer;
import com.aula_22.Trainer.service.TrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {

    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(new Trainer("Edimilson"), new Trainer("Ana"));
    }
}
