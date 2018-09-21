package huy.vu.spring.demo.Request;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import java.util.Date;

@Data
@NoArgsConstructor
public class CreateHeroRequest {
    @Valid
    private String name;
    @Valid
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    @Valid
    private String gender;

    private String description;
}
