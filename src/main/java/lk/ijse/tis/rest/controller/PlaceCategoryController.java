package lk.ijse.tis.rest.controller;

import lk.ijse.tis.rest.dto.PlaceCategoryDTO;
import lk.ijse.tis.rest.service.PlaceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by LahiruPG on 8/31/2018.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/placecategory")
public class PlaceCategoryController implements SuperController<PlaceCategoryDTO,Long>{

    @Autowired
    private PlaceCategoryService service;

    @Override
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PlaceCategoryDTO find(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @Override
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<PlaceCategoryDTO> getAll() {
        return service.getAll();
    }

    @Override
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean save(@RequestBody PlaceCategoryDTO dto) {
        return service.save(dto);
    }

    @Override
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean update(@RequestBody PlaceCategoryDTO dto) {
        return service.update(dto);
    }

    @Override
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }
}
