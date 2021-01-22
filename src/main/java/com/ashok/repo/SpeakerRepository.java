package com.ashok.repo;

import com.ashok.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAllSpeakers();
}
