package org.pinal.tutoring.morespring.activityFakeRepository;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.pinal.tutoring.morespring.activityFakeRepository.Entities.Cloth;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Component
public class FakeClothesDatabase {

    private static FakeClothesDatabase uniqueInstance = null;
    private String jsonFileLocation = "./moresrping/src/main/resources/MOCK_DATA.json";

    public List<Cloth> clothesInventory = new LinkedList<Cloth>();

    //Constructor

    public FakeClothesDatabase(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            clothesInventory  = mapper.readValue(new File(jsonFileLocation), new TypeReference<LinkedList<Cloth>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    public static FakeClothesRepository initDataset(){
//        if (uniqueInstance == null){
//            uniqueInstance = new FakeClothesRepository();
//        }
//        return uniqueInstance;
//    }

    @Override
    public String toString(){
        return this.clothesInventory.toString();
    }


}
