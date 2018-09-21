package lk.ijse.tis.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by LahiruPG on 9/2/2018.
 */
@Entity
public class User {
    @Id
    private String email;
    private String password;
    private String name;
    private String type;

    public User() {
    }

    public User(String email, String name, String type) {
        this.email = email;
        this.name = name;
        this.type = type;
    }

    public User(String email, String password, String name, String type) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
