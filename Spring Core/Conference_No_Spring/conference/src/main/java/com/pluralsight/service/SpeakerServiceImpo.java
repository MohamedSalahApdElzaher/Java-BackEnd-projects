package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImplmentation;
import com.pluralsight.repository.SpeakerRepository;

import java.util.*;

public class SpeakerServiceImpo implements SpeakerService {

    private SpeakerRepository speakerRepository =
            new HibernateSpeakerRepositoryImplmentation();

    @Override
    public List<Speaker> findAll(){
       return speakerRepository.findAll();
    }
}
