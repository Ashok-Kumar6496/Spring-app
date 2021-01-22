package com.ashok.service;

import com.ashok.model.Speaker;
import com.ashok.repo.SpeakerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
    @Autowired
    private SpeakerRepository speakerRepository;

 /*   //Constructor based Injection.
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("Constructor injection ");
        this.speakerRepository = speakerRepository;
    }

    //Setter Injection.
    @Autowired
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        System.out.println("setter injection");
        this.speakerRepository = speakerRepository;
    }*/

    /**
     * @return list of speakers
     */
    public List<Speaker> findAll() {
        return speakerRepository.findAllSpeakers();
    }
}
