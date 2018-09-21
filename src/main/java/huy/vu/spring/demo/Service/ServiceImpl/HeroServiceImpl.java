package huy.vu.spring.demo.Service.ServiceImpl;

import huy.vu.spring.demo.Entity.Hero;
import huy.vu.spring.demo.Exception.EntityNotFoundException;
import huy.vu.spring.demo.Repository.HeroJpaRepository;
import huy.vu.spring.demo.Service.HeroService;
import huy.vu.spring.demo.enums.BussinessExceptionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class HeroServiceImpl implements HeroService {
    @Autowired
    HeroJpaRepository heroJpaRepository;
    @Override
    public Hero findById(Long id) throws Exception{
        Optional<Hero> hero = heroJpaRepository.findById(id);
        if (!hero.isPresent()){
            throw new EntityNotFoundException(BussinessExceptionEnum.ENTITY_NOT_FOUND, HttpStatus.BAD_REQUEST);
        }
        return hero.get();
    }

    @Override
    public void deleteById(Long id) throws Exception{
        Optional<Hero> hero = heroJpaRepository.findById(id);
        if (!hero.isPresent()){
            throw new EntityNotFoundException(BussinessExceptionEnum.ENTITY_NOT_FOUND, HttpStatus.BAD_REQUEST);
        }
        heroJpaRepository.deleteById(id);
    }

    @Override
    public void createHero(Hero hero) throws Exception{
        heroJpaRepository.save(hero);
    }

    @Override
    public Iterable<Hero> list() throws Exception{
        return heroJpaRepository.findAll();
    }

    @Override
    public List<Hero> findAll() throws Exception {
        return heroJpaRepository.findAll();
    }

    @Override
    public void deleteHero(Hero hero) throws Exception {
        heroJpaRepository.delete(hero);
    }

    @Override
    public void updateHero(Hero hero) throws Exception {
        heroJpaRepository.save(hero);
    }
}
