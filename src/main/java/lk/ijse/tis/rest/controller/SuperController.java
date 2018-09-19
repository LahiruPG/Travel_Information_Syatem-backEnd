package lk.ijse.tis.rest.controller;

import java.util.List;

/**
 * Created by LahiruPG on 8/31/2018.
 */
public interface SuperController<T,Tid> {
    public T find(Tid id);
    public List<T> getAll();
    public boolean save(T dto);
    public boolean update(T dto);
    public boolean delete(Tid id);
}
