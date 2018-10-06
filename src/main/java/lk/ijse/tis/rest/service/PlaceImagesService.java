package lk.ijse.tis.rest.service;

import lk.ijse.tis.rest.dto.PlaceImageDTO;

import java.util.ArrayList;

/**
 * Created by LahiruPG on 9/19/2018.
 */
public interface PlaceImagesService extends SuperService<PlaceImageDTO,Long> {
    public boolean saveList(ArrayList<PlaceImageDTO> dto);
}
