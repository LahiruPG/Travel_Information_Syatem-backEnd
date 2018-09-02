package lk.ijse.tis.rest.service.impl;

import lk.ijse.tis.rest.dto.UserDTO;
import lk.ijse.tis.rest.entity.User;
import lk.ijse.tis.rest.repository.UserRepository;
import lk.ijse.tis.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LahiruPG on 9/2/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDTO get(String id) {
        User user = repository.findById(id).get();
        return new UserDTO(user.getEmail(),user.getPassword());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean save(UserDTO dto) {
        repository.save(new User(dto.getEmail(),dto.getPassword()));
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
