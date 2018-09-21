package huy.vu.spring.demo.Entity;

import huy.vu.spring.demo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_hero")
@AttributeOverride(name = "id", column = @Column(name = "id_hero"))
@Data
public class Hero extends BaseEntity{
    private String heroName;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "birthday")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDay;

    @Column(name = "description")
    private String description;

    public Hero(String name, Date date, String sex){
        this.heroName = name;
        this.birthDay = date;
        Gender gender = Gender.getValueByCode(sex);
        this.gender = gender;
    }
}
