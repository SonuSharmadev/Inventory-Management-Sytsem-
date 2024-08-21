package com.sonu.inventory_management_system.Controllers;

import com.sonu.inventory_management_system.Entites.Location;
import com.sonu.inventory_management_system.Services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/location")
@CrossOrigin
public class LocationController {
    @Autowired
    private LocationService locationService;

    @GetMapping("/all")
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Location> getLocationById(@PathVariable int id) {
        Location location = locationService.getLocationById(id).get();
        return ResponseEntity.ok(location);
    }

    @PostMapping("/add")
    public Location createLocation(@RequestBody Location location) {
        return locationService.saveLocation(location);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Location> updateLocation(@PathVariable int id, @RequestBody Location locationDetails) {
        Location updatedLocation = locationService.updateLocation(id, locationDetails);
        return ResponseEntity.ok(updatedLocation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLocation(@PathVariable int id) {
        locationService.deleteLocation(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/name/{id}")
    public ResponseEntity<String> getNameByLocationId(@PathVariable("id") Long locationId) {
        String locationName = locationService.getNameByLocationId(locationId);
        if (locationName != null) {
            return new ResponseEntity<>(locationName, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
