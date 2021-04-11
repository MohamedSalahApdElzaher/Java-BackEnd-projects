package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImplmentation implements SpeakerRepository {

    @Override
    public List <Speaker> findAll(){
        List<Speaker> list = new ArrayList<>();
        Speaker sp = new Speaker();
        sp.setfName("Muhammad");
        sp.setlName("Salah");
        list.add(sp);
        return list;
    }

}
