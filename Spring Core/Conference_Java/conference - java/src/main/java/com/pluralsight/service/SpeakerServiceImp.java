package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImplmentation;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("speakerService")
public class SpeakerServiceImp implements SpeakerService {

    private SpeakerRepository speakerRepository;

    // no args constructor
    public SpeakerServiceImp(){
        System.out.println("Inside no args constructor");
    }

    // Constructor to inject into speakerService
    @Autowired
    public SpeakerServiceImp(SpeakerRepository repository){
        System.out.println("Inside Constructor speakerRepository");
        speakerRepository = repository;
    }

    @Override
    public List<Speaker> findAll(){
       return speakerRepository.findAll();
    }

    // setter method to inject into speakerService
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        System.out.println("Inside Setter speakerRepository");
        this.speakerRepository = speakerRepository;
    }
}
