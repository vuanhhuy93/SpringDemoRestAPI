package huy.vu.spring.demo.convert;

import huy.vu.spring.demo.Entity.Hero;
import huy.vu.spring.demo.Request.CreateHeroRequest;

public class HeroConvert {
    public static Hero convert(CreateHeroRequest request){
        Hero hero = new Hero(request.getName(), request.getBirthday(), request.getGender());
        return hero;
    }
}
