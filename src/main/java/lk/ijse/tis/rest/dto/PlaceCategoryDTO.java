package lk.ijse.tis.rest.dto;

/**
 * Created by LahiruPG on 8/30/2018.
 */
public class PlaceCategoryDTO {
    private long id;
    private String name;

    public PlaceCategoryDTO() {
    }

    public PlaceCategoryDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PlaceCategoryDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
