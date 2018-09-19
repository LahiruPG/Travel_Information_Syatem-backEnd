package lk.ijse.tis.rest.controller;

import lk.ijse.tis.rest.dto.PlaceDTO;
import lk.ijse.tis.rest.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
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

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean updatePlace(@RequestBody PlaceDTO dto) {
        return service.updatePlace(dto);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deletePlace(@PathVariable Long id) {
        return service.deletePlace(id);
    }

    @RequestMapping(value = "/images", method = RequestMethod.POST)
    public String uploadFiles(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        System.out.println("Executed.");
        String fileUrl = "";

        try {
            String filePath = request.getServletContext().getRealPath("/");

            System.out.println(filePath);

            File f1 = new File(filePath + "/uploads/" + file.getOriginalFilename());
            file.transferTo(f1);

            fileUrl = f1.getAbsolutePath();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileUrl;
    }
}
