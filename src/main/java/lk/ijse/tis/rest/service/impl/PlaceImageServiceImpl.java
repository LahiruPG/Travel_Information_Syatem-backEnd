package lk.ijse.tis.rest.service.impl;

import lk.ijse.tis.rest.dto.PlaceImageDTO;
import lk.ijse.tis.rest.entity.PlaceImage;
import lk.ijse.tis.rest.repository.PlaceImageRepository;
import lk.ijse.tis.rest.service.PlaceImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LahiruPG on 9/19/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PlaceImageServiceImpl implements PlaceImagesService {

    @Autowired
    private PlaceImageRepository repository;

    @Override
    public List<PlaceImageDTO> gerAll() {
        List<PlaceImage> all = repository.findAll();
        List<PlaceImageDTO> dtos =new ArrayList<>();
        for (PlaceImage pi : all) {
            dtos.add(new PlaceImageDTO(pi.getId(),pi.getPlaceId(),pi.getUrl()));
        }
        return dtos;
    }

    @Override
    public PlaceImageDTO find(Long id) {
        PlaceImage pi = repository.findById(id).get();
        return new PlaceImageDTO(pi.getId(),pi.getPlaceId(),pi.getUrl());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean save(PlaceImageDTO dto) {
        repository.save(new PlaceImage(dto.getPlaceId(),dto.getUrl()));
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean update(PlaceImageDTO dto) {
        return false;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }
}
