package lk.ijse.tis.rest.service;

import lk.ijse.tis.rest.dto.UserDTO;

/**
 * Created by LahiruPG on 9/2/2018.
 */
public interface UserService {

    public UserDTO get(UserDTO dto);
    public boolean save(UserDTO dto);
    public boolean update(UserDTO dto);
    public boolean delete(Long id);

}
