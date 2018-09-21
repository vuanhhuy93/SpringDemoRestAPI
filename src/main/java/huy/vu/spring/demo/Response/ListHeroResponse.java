package huy.vu.spring.demo.Response;

import huy.vu.spring.demo.Entity.Hero;
import lombok.Data;

import java.util.List;

@Data
public class ListHeroResponse {
    private List<Hero> heroes;
}
