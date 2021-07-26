package com.java.springbootbike.api;

import com.java.springbootbike.dao.entity.Bike;
import com.java.springbootbike.manager.BikeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/bikes")
public class BikeApi {

    private BikeManager bikeManager;

    @Autowired
    public BikeApi(BikeManager bikeManager) {
        this.bikeManager = bikeManager;
    }

    @GetMapping("/all")
    public Iterable<Bike> getAllBikes() {
        return bikeManager.findAllBikes();
    }

    @GetMapping("/id")
    public Optional<Bike> getBikeByIdWithParam(@RequestParam Long id) {
        return bikeManager.findBikeById(id);
    }

    @GetMapping("/id/{id}")
    public Optional<Bike> getBikeById(@PathVariable("id") Long id) {
        return bikeManager.findBikeById(id);
    }

    @PostMapping
    public Bike addBike(@RequestBody Bike bike) {
        return bikeManager.saveBike(bike);
    }

    @PutMapping
    public Bike updateBike(@RequestBody Bike bike) {
        return bikeManager.saveBike(bike);
    }

    @DeleteMapping
    public void deleteBikeById(@RequestParam Long index) {
        bikeManager.deleteBikeById(index);
    }
}
