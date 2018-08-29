package lk.ijse.tis.rest.controller;

import lk.ijse.tis.rest.dto.PlaceDTO;
import lk.ijse.tis.rest.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by LahiruPG on 8/23/2018.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/places")
public class PlaceController {

    @Autowired
    private PlaceService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<PlaceDTO> gerAllPlaces() {
        return service.gerAllPlaces();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PlaceDTO getPlace(@PathVariable Long id) {
        return service.getPlace(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean savePlace(@RequestBody PlaceDTO dto) {
        return service.savePlace(dto);
    }

    //@PostMapping(value = "/update",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @PutMapping (consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean updatePlace(@RequestBody PlaceDTO dto) {
        return service.savePlace(dto);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deletePlace(@PathVariable Long id) {
        return service.deletePlace(id);

    }
}
