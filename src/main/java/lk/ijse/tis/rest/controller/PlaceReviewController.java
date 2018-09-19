package lk.ijse.tis.rest.controller;

import lk.ijse.tis.rest.dto.PlaceReviewDTO;
import lk.ijse.tis.rest.service.PlaceReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LahiruPG on 9/19/2018.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/placereviews")
public class PlaceReviewController implements SuperController<PlaceReviewDTO,Long>{

    @Autowired
    private PlaceReviewService service;

    @Override
    @GetMapping(value = "/id", produces = MediaType.APPLICATION_JSON_VALUE)
    public PlaceReviewDTO find(@PathVariable Long id) {
        return service.find(id);
    }

    @Override
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PlaceReviewDTO> getAll() {
        return service.gerAll();
    }

    @Override
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean save(@RequestBody PlaceReviewDTO dto) {
        return service.save(dto);
    }

    @Override
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean update(@RequestBody PlaceReviewDTO dto) {
        return service.update(dto);
    }

    @Override
    @DeleteMapping(value = "/id",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean delete(Long id) {
        return service.delete(id);
    }
}
