package lk.ijse.tis.rest.service;

import lk.ijse.tis.rest.dto.PlaceCategoryDTO;

import java.util.ArrayList;

/**
 * Created by LahiruPG on 8/30/2018.
 */
public interface PlaceCategoryService {
    public ArrayList<PlaceCategoryDTO> getAll();
    public PlaceCategoryDTO get( Long id);
    public boolean save(PlaceCategoryDTO dto);
    public boolean update(PlaceCategoryDTO dto);
    public boolean delete(Long id);
}
