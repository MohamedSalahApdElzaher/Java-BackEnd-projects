package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

import java.util.*;

public class SpeakerServiceImpo implements SpeakerService {

    private SpeakerRepository speakerRepository ;

    @Override
    public List<Speaker> findAll(){
       return speakerRepository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }
}
