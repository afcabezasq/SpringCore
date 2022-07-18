package org.pinal.tutoring.morespring.activityFakeRepository.interfaces;

import org.pinal.tutoring.morespring.activityFakeRepository.Entities.Cloth;

import java.util.List;

public interface ClothesDAO {
    public boolean AddCloth( Cloth cloth);
    public Cloth GetById(String id);
    public boolean UpdateClothe(Cloth cloth);
    public boolean DeleteClotheById(String id);
    public List<Cloth> getAllClothes();
}
