package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public  HibernateSpeakerRepositoryImpl(){
        System.out.println("This is a no args constructor inside RepoImpl");
    }
    public List<Speaker> findAll(){

        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Abhi singh");
        speaker.setLastName("Singh");
        speakers.add(speaker);
        return speakers;
    }

}
