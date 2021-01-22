package com.ashok.repo;

import com.ashok.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("speakerRepository")
public class SpeakerRepositoryImpl implements SpeakerRepository {

    /**
     * @return list of speakers.
     */
    public List<Speaker> findAllSpeakers() {
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();
        speaker.setSpeakerAddress("Hyderabad");
        speaker.setSpeakerName("Ashok Kumar");
        speakers.add(speaker);
        return speakers;
    }
}
