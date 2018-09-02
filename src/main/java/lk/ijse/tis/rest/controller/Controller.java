package lk.ijse.tis.rest.controller;

import lk.ijse.tis.rest.dto.PlaceCategoryDTO;

import java.util.ArrayList;

/**
 * Created by LahiruPG on 8/31/2018.
 */
public interface Controller<T,id> {
    public T get(id id);
    public ArrayList<T> getAll();
    public boolean save(T dto);
    public boolean update(T dto);
    public boolean delete(id id);
}
