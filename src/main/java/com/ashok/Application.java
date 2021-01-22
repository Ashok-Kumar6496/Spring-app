package com.ashok;

import com.ashok.config.AppConfig;
import com.ashok.model.Speaker;
import com.ashok.repo.SpeakerRepository;
import com.ashok.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static java.lang.System.out;

public class Application {
    public static void main(String... s) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);
        List<Speaker> speakers = speakerService.findAll();
        out.println(speakers.get(0).getSpeakerAddress() + "And\n" + speakers.get(0).getSpeakerName());
        SpeakerRepository speakerRepository = applicationContext.getBean("speakerRepository", SpeakerRepository.class);
        out.println(speakerRepository.findAllSpeakers().get(0).getSpeakerAddress());
    }
}
