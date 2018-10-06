package lk.ijse.tis.rest.service;

import lk.ijse.tis.rest.dto.PlaceDTO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * Created by LahiruPG on 8/23/2018.
 */
public interface PlaceService {
    public ArrayList<PlaceDTO> gerAllPlaces();
    public PlaceDTO getPlace( Long id);
    public boolean savePlace(PlaceDTO dto);
    public boolean updatePlace(PlaceDTO dto);
    public boolean deletePlace(Long id);
    public String uploadImage(MultipartFile file, HttpServletRequest request);
}
