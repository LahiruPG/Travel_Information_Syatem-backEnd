package lk.ijse.tis.rest.service.impl;

import lk.ijse.tis.rest.dto.PlaceDTO;
import lk.ijse.tis.rest.entity.Place;
import lk.ijse.tis.rest.repository.PlaceRepository;
import lk.ijse.tis.rest.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LahiruPG on 8/23/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class placeServiceImpl  implements PlaceService{

    @Autowired
    private PlaceRepository repository;

    @Override
    public ArrayList<PlaceDTO> gerAllPlaces() {
        List<Place> places = repository.findAll();
        ArrayList<PlaceDTO> dtos=new ArrayList<>();

        for (Place place :places) {
            dtos.add(new PlaceDTO(place.getId(),place.getName(),place.getType(),place.getAddress(),place.getDistrict(),place.getLatitude(),place.getLongitude(),place.getDescription(),place.getNotes(),place.getStatus()));
        }
        return dtos;
    }

    @Override
    public PlaceDTO getPlace(Long id) {
        Place place = repository.getOne(id);
        return new PlaceDTO(place.getId(),place.getName(),place.getType(),place.getAddress(),place.getDistrict(),place.getLatitude(),place.getLongitude(),place.getDescription(),place.getNotes(),place.getStatus());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean savePlace(PlaceDTO place) {
       repository.save(new Place(place.getName(),place.getType(),place.getAddress(),place.getDistrict(),place.getLatitude(),place.getLongitude(),place.getDescription(),place.getNotes(),place.getStatus()));
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deletePlace(Long id) {
        repository.deleteById(id);
        return true;
    }
}
