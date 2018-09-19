package lk.ijse.tis.rest.entity;

import javax.persistence.*;

/**
 * Created by LahiruPG on 8/23/2018.
 */
@Entity
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String address;
    private String description;
    private String district;
    private String town;
    @Column(length = 1000)
    private String MapLocation;
    @Column(length = 10000)
    private String notes;
    private String status;

    public Place() {
    }

    public Place(String name, String type, String address, String description, String district, String town, String mapLocation, String notes, String status) {
        this.name = name;
        this.type = type;
        this.address = address;
        this.description = description;
        this.district = district;
        this.town = town;
        MapLocation = mapLocation;
        this.notes = notes;
        this.status = status;
    }

    public Place(Long id, String name, String type, String address, String description, String district, String town, String mapLocation, String notes, String status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.description = description;
        this.district = district;
        this.town = town;
        MapLocation = mapLocation;
        this.notes = notes;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getMapLocation() {
        return MapLocation;
    }

    public void setMapLocation(String mapLocation) {
        MapLocation = mapLocation;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", district='" + district + '\'' +
                ", town='" + town + '\'' +
                ", MapLocation='" + MapLocation + '\'' +
                ", notes='" + notes + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
