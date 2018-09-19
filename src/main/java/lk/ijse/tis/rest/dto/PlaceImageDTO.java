package lk.ijse.tis.rest.dto;

/**
 * Created by LahiruPG on 9/19/2018.
 */
public class PlaceImageDTO {
    private Long id;
    private Long placeId;
    private String url;

    public PlaceImageDTO() {
    }

    public PlaceImageDTO(Long id, Long placeId, String url) {
        this.id = id;
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
        return "PlacceImagesDTO{" +
                "id=" + id +
                ", placeId=" + placeId +
                ", url='" + url + '\'' +
                '}';
    }
}
