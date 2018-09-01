package lk.ijse.tis.rest.service.impl;

import lk.ijse.tis.rest.dto.PlaceCategoryDTO;
import lk.ijse.tis.rest.entity.PlaceCategory;
import lk.ijse.tis.rest.repository.PlaceCategoryRepository;
import lk.ijse.tis.rest.service.PlaceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LahiruPG on 8/31/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PlaceCategoryServiceImpl implements PlaceCategoryService {

    @Autowired
    private PlaceCategoryRepository repository;

    @Override
    public ArrayList<PlaceCategoryDTO> getAll() {
        List<PlaceCategory> placeCategoryList = repository.findAll();
        ArrayList<PlaceCategoryDTO> placeCategoryDTOS = new ArrayList<>();
        for (PlaceCategory pc :
                placeCategoryList) {
            placeCategoryDTOS.add(new PlaceCategoryDTO(pc.getId(), pc.getName()));
        }
        return placeCategoryDTOS;
    }

    @Override
    public PlaceCategoryDTO get(Long id) {
        PlaceCategory placeCategory = repository.findById(id).get();
        return new PlaceCategoryDTO(placeCategory.getId(), placeCategory.getName());

    }

    @Override
    public boolean save(PlaceCategoryDTO dto) {
        repository.save(new PlaceCategory(dto.getName()));
        return true;
    }

    @Override
    public boolean update(PlaceCategoryDTO dto) {
        PlaceCategory one = repository.getOne(dto.getId());
        one.setName(dto.getName());
        repository.save(one);
        return true;
    }

    @Override
    public boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }
}
