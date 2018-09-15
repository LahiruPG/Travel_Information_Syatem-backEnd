package lk.ijse.tis.rest.dto;

import java.util.ArrayList;

/**
 * Created by LahiruPG on 9/15/2018.
 */
public class AddPlaceDTO {
    private Long id;
    private String name;
    private String type;
    private String address;
    private String district;
    private String latitude;
    private String longitude;
    private String description;
    private String notes;
    private ArrayList<String> fileList;
    private String status;

    public AddPlaceDTO() {
    }

    public AddPlaceDTO(Long id, String name, String type, String address, String district, String latitude, String longitude, String description, String notes, ArrayList<String> fileList, String status) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.district = district;
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
        this.notes = notes;
        this.fileList = fileList;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ArrayList<String> getFileList() {
        return fileList;
    }

    public void setFileList(ArrayList<String> fileList) {
        this.fileList = fileList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AddPlaceDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", district='" + district + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", description='" + description + '\'' +
                ", notes='" + notes + '\'' +
                ", fileList=" + fileList +
                ", status='" + status + '\'' +
                '}';
    }
}
