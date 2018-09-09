package lk.ijse.tis.rest.service.impl;

import lk.ijse.tis.rest.dto.UserDTO;
import lk.ijse.tis.rest.entity.User;
import lk.ijse.tis.rest.repository.UserRepository;
import lk.ijse.tis.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

/**
 * Created by LahiruPG on 9/2/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDTO get(UserDTO dto) {
        try {
            User user = repository.findById(dto.getEmail()).get();
            if (dto.getPassword().matches(user.getPassword())) {
                return new UserDTO(user.getEmail(), null, user.getName(), user.getType());
            }else {
                return new UserDTO();
            }
        } catch (NoSuchElementException e) {
            return new UserDTO();
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean save(UserDTO dto) {
        repository.save(new User(dto.getEmail(), dto.getPassword(), dto.getName(), dto.getType()));
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean update(UserDTO dto) {
        return false;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean delete(Long id) {
        return false;
    }
}
