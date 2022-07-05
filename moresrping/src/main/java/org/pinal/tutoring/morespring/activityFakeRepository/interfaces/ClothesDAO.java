package org.pinal.tutoring.morespring.activityFakeRepository.interfaces;

import org.pinal.tutoring.morespring.activityFakeRepository.Entities.Clothe;

public interface ClothesDAO {
    public boolean AddClothes();
    public Clothe GetById();
    public boolean UpdateClothe();
    public boolean DeleteClotheById();
}
