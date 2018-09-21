package huy.vu.spring.demo.Repository;

import huy.vu.spring.demo.Entity.Hero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface HeroJpaRepository extends CrudRepository<Hero, Long> {
    @Query(value = "select p FROM  Hero p WHERE 1=1")
    List<Hero> findAll();
}
