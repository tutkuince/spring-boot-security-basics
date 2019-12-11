package com.muditasoft.springbootsecuritybasics.service.impl;

import com.muditasoft.springbootsecuritybasics.entity.Location;
import com.muditasoft.springbootsecuritybasics.repository.LocationRepository;
import com.muditasoft.springbootsecuritybasics.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> getLocations() {
        return locationRepository.findAll();
    }
}
