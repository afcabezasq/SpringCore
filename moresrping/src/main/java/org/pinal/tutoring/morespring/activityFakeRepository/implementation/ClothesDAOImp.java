package org.pinal.tutoring.morespring.activityFakeRepository.implementation;

import org.pinal.tutoring.morespring.activityFakeRepository.Entities.Clothe;
import org.pinal.tutoring.morespring.activityFakeRepository.interfaces.ClothesDAO;

public class ClothesDAOImp implements ClothesDAO {
    @Override
    public boolean AddClothes() {
        return false;
    }

    @Override
    public Clothe GetById() {
        return null;
    }

    @Override
    public boolean UpdateClothe() {
        return false;
    }

    @Override
    public boolean DeleteClotheById() {
        return false;
    }
}
