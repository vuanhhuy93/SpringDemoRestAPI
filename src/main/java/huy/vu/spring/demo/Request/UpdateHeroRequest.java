package huy.vu.spring.demo.Request;

        import lombok.Data;
        import lombok.NoArgsConstructor;
        import org.springframework.format.annotation.DateTimeFormat;

        import javax.validation.Valid;
        import javax.validation.constraints.Min;
        import java.util.Date;

@Data
@NoArgsConstructor
public class UpdateHeroRequest {
    @Valid
    @Min(1)
    private Long heroId;
    private String heroName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String gender;
}
