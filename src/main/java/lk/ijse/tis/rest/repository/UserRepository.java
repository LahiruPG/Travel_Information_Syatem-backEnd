package lk.ijse.tis.rest.repository;

import lk.ijse.tis.rest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by LahiruPG on 9/2/2018.
 */
public interface UserRepository extends JpaRepository<User,String> {
}
