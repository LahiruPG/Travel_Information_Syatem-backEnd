package lk.ijse.tis.rest.controller;

import lk.ijse.tis.rest.dto.PlaceCategoryDTO;

import java.util.ArrayList;

/**
 * Created by LahiruPG on 8/31/2018.
 */
public interface Controller {
    public PlaceCategoryDTO get(long id);
    public ArrayList<PlaceCategoryDTO> getAll();
    public boolean save(PlaceCategoryDTO dto);
    public boolean update(PlaceCategoryDTO dto);
    public boolean delete(long id);
}
