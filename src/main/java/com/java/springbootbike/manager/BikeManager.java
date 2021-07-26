package com.java.springbootbike.manager;

import com.java.springbootbike.dao.entity.Bike;
import com.java.springbootbike.dao.entity.Biker;
import com.java.springbootbike.dao.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BikeManager {

    private BikeRepository bikeRepository;

    @Autowired
    public BikeManager(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    public Iterable<Bike> findAllBikes() {
        return bikeRepository.findAll();
    }

    public Optional<Bike> findBikeById(Long id) {
        return bikeRepository.findById(id);
    }

    public Bike saveBike(Bike bike) {
        return bikeRepository.save(bike);
    }

    public void deleteBikeById(Long id) {
        bikeRepository.deleteById(id);
    }
}


