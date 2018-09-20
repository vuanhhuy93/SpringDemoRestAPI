package huy.vu.spring.demo.Service;

import huy.vu.spring.demo.Entity.Hero;

public interface HeroService {
    Hero findById(Long id) throws Exception;
    void deleteById(Long id) throws Exception;
    void createHero(Hero hero) throws Exception;
    Iterable<Hero> list() throws Exception;
    void deleteHero(Hero hero) throws Exception;
    void updateHero(Hero hero) throws Exception;


}
