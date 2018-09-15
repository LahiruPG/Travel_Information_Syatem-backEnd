package lk.ijse.tis.rest.controller;

import lk.ijse.tis.rest.dto.UserDTO;
import lk.ijse.tis.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by LahiruPG on 9/2/2018.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO get(@RequestBody UserDTO dto) {
        return service.get(dto);

    }

    public ArrayList<UserDTO> getAll() {
        return null;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean save(@RequestBody UserDTO dto) {
        return service.save(dto);
    }

    public boolean update(UserDTO dto) {
        return false;
    }

    public boolean delete(String id) {
        return false;
    }
}
