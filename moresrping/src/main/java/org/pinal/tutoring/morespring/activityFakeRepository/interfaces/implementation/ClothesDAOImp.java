package org.pinal.tutoring.morespring.activityFakeRepository.interfaces.implementation;

import org.pinal.tutoring.morespring.activityFakeRepository.Entities.Cloth;
import org.pinal.tutoring.morespring.activityFakeRepository.FakeClothesDatabase;
import org.pinal.tutoring.morespring.activityFakeRepository.interfaces.ClothesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;


@Component("dao")
public class ClothesDAOImp implements ClothesDAO {

    @Autowired
    FakeClothesDatabase repo;

    @Override
    public boolean AddCloth( Cloth cloth) {

        Cloth newCloth =  new Cloth();
        newCloth.setId(UUID.randomUUID().toString());
        newCloth.setColor(cloth.getColor());
        newCloth.setSize(cloth.getSize());
        newCloth.setWas_bought(false);
        return repo.clothesInventory.add(newCloth);

    }

    @Override
    public Cloth GetById(String Id) {

        for (Cloth c:repo.clothesInventory){
            if (c.getId().equals(Id) ){
                return c;
            }
        }

        return null;
    }

    @Override
    public boolean UpdateClothe(Cloth cloth) {
        return false;
    }

    @Override
    public boolean DeleteClotheById(String Id) {
        for(int i = 0; i <repo.clothesInventory.size(); i++){
            if (repo.clothesInventory.get(i).getId().equals(Id)){
                repo.clothesInventory.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Cloth> getAllClothes() {
        return repo.clothesInventory;
    }
}
