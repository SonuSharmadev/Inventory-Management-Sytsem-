package com.sonu.inventory_management_system.Services;

import com.sonu.inventory_management_system.Entites.Location;
import com.sonu.inventory_management_system.Repositories.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    private LocationRepo locationRepo;

    public List<Location> getAllLocations() {
        return locationRepo.findAll();
    }

    public Optional< Location> getLocationById(int id) {
        return locationRepo.findById(id);
    }

    public Location saveLocation(Location location) {
        return locationRepo.save(location);
    }

    public Location updateLocation(int id, Location locationDetails) {
        Location location = locationRepo.findById(id).get();
        location.setName(locationDetails.getName());

        return locationRepo.save(location);
    }

    public void deleteLocation(int id) {
        Location location = locationRepo.findById(id).get();
        locationRepo.delete(location);
    }

    public String getNameByLocationId(Long locationId) {
            return locationRepo.findNameByLocationId(locationId);
    }
}
