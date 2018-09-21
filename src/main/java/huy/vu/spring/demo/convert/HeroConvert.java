package huy.vu.spring.demo.convert;

import huy.vu.spring.demo.Entity.Hero;
import huy.vu.spring.demo.Request.CreateHeroRequest;
import huy.vu.spring.demo.Request.UpdateHeroRequest;
import huy.vu.spring.demo.enums.Gender;

public class HeroConvert {
    public static Hero convert(CreateHeroRequest request){
        Hero hero = new Hero(request.getName(), request.getBirthday(), request.getGender());
        hero.setDescription(request.getDescription());
        return hero;
    }
    public static void convertUpdate(UpdateHeroRequest request, Hero hero){

        hero.setBirthDay(request.getBirthday());
        hero.setHeroName(request.getHeroName());
        hero.setDescription(request.getDescriptiton());
        hero.setGender(Gender.getValueByCode(request.getGender()));
    }

}
