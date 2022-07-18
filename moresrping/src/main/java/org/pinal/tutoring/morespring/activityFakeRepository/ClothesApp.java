package org.pinal.tutoring.morespring.activityFakeRepository;

import org.pinal.tutoring.morespring.activityFakeRepository.Entities.Cloth;
import org.pinal.tutoring.morespring.activityFakeRepository.interfaces.ClothesDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class ClothesApp {
    public static void main(String[] args) {
        //File file = new File("./moresrping/src/main/resources/MOCK_DATA.json");
        //for(String fileNames : file.list()) System.out.println(fileNames);

        //System.out.println(repo);

        ApplicationContext context = new ClassPathXmlApplicationContext("clothesAppConfig.xml");

        ClothesDAO dao = (ClothesDAO) context.getBean("dao");

        dao.AddCloth(new Cloth());

        Cloth gotCloth = dao.GetById("4cc28415-0e8e-4291-89b3-9e34bf7e28ed");

        System.out.println(dao.getAllClothes());
        System.out.println(gotCloth);


    }
}
