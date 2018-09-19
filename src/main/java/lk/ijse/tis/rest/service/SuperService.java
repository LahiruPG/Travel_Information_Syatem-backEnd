package lk.ijse.tis.rest.service;

import java.util.List;

/**
 * Created by LahiruPG on 9/19/2018.
 */
public interface SuperService<T,Tid>{
    public List<T> gerAll();
    public T find(Tid id);
    public boolean save(T dto);
    public boolean update(T dto);
    public boolean delete(Tid id);
}
