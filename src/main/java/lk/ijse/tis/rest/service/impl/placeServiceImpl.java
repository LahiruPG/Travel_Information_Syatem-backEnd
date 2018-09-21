package lk.ijse.tis.rest.service.impl;

import lk.ijse.tis.rest.dto.PlaceDTO;
import lk.ijse.tis.rest.dto.PlaceReviewDTO;
import lk.ijse.tis.rest.dto.UserDTO;
import lk.ijse.tis.rest.entity.Place;
import lk.ijse.tis.rest.entity.PlaceReview;
import lk.ijse.tis.rest.entity.User;
import lk.ijse.tis.rest.repository.PlaceRepository;
import lk.ijse.tis.rest.repository.PlaceReviewRepository;
import lk.ijse.tis.rest.repository.UserRepository;
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
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class placeServiceImpl implements PlaceService {

    @Autowired
    private PlaceRepository repository;

    @Autowired
    private PlaceReviewRepository reviewRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public ArrayList<PlaceDTO> gerAllPlaces() {
        List<Place> places = repository.findAll();
        ArrayList<PlaceDTO> dtos = new ArrayList<>();

        for (Place place : places) {
            dtos.add(new PlaceDTO(place.getId(), place.getName(), place.getType(), place.getAddress(), place.getDescription(), place.getDistrict(), place.getTown(), place.getMapLocation(), place.getNotes(), place.getStatus()));
        }
        return dtos;
    }

    @Override
    public PlaceDTO getPlace(Long id) {
        Place place = repository.findById(id).get();
        PlaceDTO dto = new PlaceDTO(place.getId(), place.getName(), place.getType(), place.getAddress(), place.getDescription(), place.getDistrict(), place.getTown(), place.getMapLocation(), place.getNotes(), place.getStatus());

        ArrayList<PlaceReview> byPlaceId = reviewRepository.findByPlaceId(id);
        ArrayList<PlaceReviewDTO> reviewDTOS = new ArrayList<>();

        for (PlaceReview pr : byPlaceId) {
            PlaceReviewDTO prDto = new PlaceReviewDTO(pr.getId(), pr.getPlaceId(), pr.getUserEmail(), pr.getStarCount(), pr.getReview());

            User user = userRepository.findById(prDto.getUserEmail()).get();
            prDto.setUser(new UserDTO(user.getEmail(), user.getName(), user.getType()));

            reviewDTOS.add(prDto);
        }
        dto.setReview(reviewDTOS);
        return dto;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean savePlace(PlaceDTO place) {
        repository.save(new Place(place.getName(), place.getType(), place.getAddress(), place.getDescription(), place.getDistrict(), place.getTown(), place.getMapLocation(), place.getNotes(), place.getStatus()));
        return true;
    }

    @Override
    public boolean updatePlace(PlaceDTO dto) {
        Place toUpdate = repository.findById(dto.getId()).get();

        toUpdate.setName(dto.getName());
        toUpdate.setType(dto.getType());
        toUpdate.setAddress(dto.getAddress());
        toUpdate.setDescription(dto.getDescription());
        toUpdate.setDistrict(dto.getDistrict());
        toUpdate.setTown(dto.getTown());
        toUpdate.setMapLocation(dto.getMapLocation());
        toUpdate.setNotes(dto.getNotes());
        toUpdate.setStatus(dto.getStatus());

        repository.save(toUpdate);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deletePlace(Long id) {
        repository.deleteById(id);
        return true;
    }
}
