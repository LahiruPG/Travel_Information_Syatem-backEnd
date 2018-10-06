package lk.ijse.tis.rest.repository;

import lk.ijse.tis.rest.entity.PlaceImage;
import lk.ijse.tis.rest.entity.PlaceReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

/**
 * Created by LahiruPG on 9/19/2018.
 */
public interface PlaceImageRepository extends JpaRepository<PlaceImage,Long> {
    @Query("SELECT pi FROM PlaceImage pi WHERE pi.placeId = ?1")
    ArrayList<PlaceImage> findByPlaceId(Long id);
}
