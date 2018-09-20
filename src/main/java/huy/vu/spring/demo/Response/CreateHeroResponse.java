package huy.vu.spring.demo.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateHeroResponse {
    @JsonProperty("hero_id")
    private Long heroId;
}
