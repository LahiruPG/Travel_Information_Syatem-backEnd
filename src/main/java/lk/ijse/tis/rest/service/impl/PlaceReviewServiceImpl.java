package lk.ijse.tis.rest.service.impl;

import lk.ijse.tis.rest.dto.PlaceReviewDTO;
import lk.ijse.tis.rest.entity.PlaceReview;
import lk.ijse.tis.rest.repository.PlaceReviewRepository;
import lk.ijse.tis.rest.service.PlaceReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by LahiruPG on 9/19/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PlaceReviewServiceImpl implements PlaceReviewService {

    @Autowired
    private PlaceReviewRepository repository;

    @Override
    public List<PlaceReviewDTO> gerAll() {
        List<PlaceReview> all = repository.findAll();
        List<PlaceReviewDTO> dtos = new ArrayList<>();

        for (PlaceReview pr : all) {
            dtos.add(new PlaceReviewDTO(pr.getId(), pr.getPlaceId(), pr.getUserEmail(), pr.getStarCount(), pr.getReview()));
        }
        return dtos;
    }

    @Override
    public PlaceReviewDTO find(Long id) {
        PlaceReview pr = repository.findById(id).get();
        return new PlaceReviewDTO(pr.getId(), pr.getPlaceId(), pr.getUserEmail(), pr.getStarCount(), pr.getReview());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean save(PlaceReviewDTO dto) {
        repository.save(new PlaceReview(dto.getPlaceId(), dto.getUserEmail(), dto.getStarCount(), dto.getReview()));
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean update(PlaceReviewDTO dto) {
        PlaceReview pr = repository.findById(dto.getId()).get();
        pr.setPlaceId(dto.getPlaceId());
        pr.setStarCount(dto.getStarCount());
        pr.setReview(dto.getReview());
        repository.save(pr);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }
}
