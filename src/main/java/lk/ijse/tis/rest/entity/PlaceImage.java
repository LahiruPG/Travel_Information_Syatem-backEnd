package lk.ijse.tis.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by LahiruPG on 9/19/2018.
 */
@Entity
public class PlaceImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long placeId;
    private String url;

    public PlaceImage() {
    }

    public PlaceImage(Long placeId, String url) {
        this.placeId = placeId;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "PlaceImages{" +
                "id=" + id +
                ", placeId=" + placeId +
                ", url='" + url + '\'' +
                '}';
    }
}
