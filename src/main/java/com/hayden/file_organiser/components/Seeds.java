package com.hayden.file_organiser.components;

import com.hayden.file_organiser.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Seeds implements ApplicationRunner {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    MatterRepository matterRepository;

    @Autowired
    FeeEarnerRepository feeEarnerRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    LocationRepository locationRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
