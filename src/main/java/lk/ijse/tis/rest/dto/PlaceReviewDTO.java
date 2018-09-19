package lk.ijse.tis.rest.dto;

/**
 * Created by LahiruPG on 9/19/2018.
 */
public class PlaceReviewDTO {
    private Long id;
    private Long placeId;
    private String userEmail;
    private int starCount;
    private String review;

    public PlaceReviewDTO() {
    }

    public PlaceReviewDTO(Long id, Long placeId, String userEmail, int starCount, String review) {
        this.id = id;
        this.placeId = placeId;
        this.userEmail = userEmail;
        this.starCount = starCount;
        this.review = review;
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

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getStarCount() {
        return starCount;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "PlaceReviewDTO{" +
                "id=" + id +
                ", placeId=" + placeId +
                ", userEmail='" + userEmail + '\'' +
                ", starCount=" + starCount +
                ", review='" + review + '\'' +
                '}';
    }
}

