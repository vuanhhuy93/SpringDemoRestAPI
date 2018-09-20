package huy.vu.spring.demo.Repository;

import huy.vu.spring.demo.Entity.Hero;
import org.springframework.data.repository.CrudRepository;

public interface HeroJpaRepository extends CrudRepository<Hero, Long> {

}
