package huy.vu.spring.demo.Response;

import huy.vu.spring.demo.Entity.Hero;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FindHeroResponse {
    private Hero hero;
}
