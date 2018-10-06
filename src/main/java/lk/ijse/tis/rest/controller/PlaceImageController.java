package lk.ijse.tis.rest.controller;

import lk.ijse.tis.rest.dto.PlaceImageDTO;
import lk.ijse.tis.rest.service.PlaceImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LahiruPG on 9/19/2018.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/placeimages")
public class PlaceImageController implements SuperController<PlaceImageDTO, Long> {

    @Autowired
    private PlaceImagesService service;

    @Override
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PlaceImageDTO find(@PathVariable("id") Long id) {
        return service.find(id);
    }

    @Override
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PlaceImageDTO> getAll() {
        return service.gerAll();
    }

    @Override
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean save(@RequestBody PlaceImageDTO dto) {
        return service.save(dto);
    }

    @Override
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean update(PlaceImageDTO dto) {
        return false;
    }

    @Override
    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @PostMapping(value = "list", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveList(@RequestBody ArrayList<PlaceImageDTO> dto) {
        return service.saveList(dto);
    }
}
