package huy.vu.spring.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@MappedSuperclass
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(
            name = "ID_ENTITY"
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    @Basic(
            optional = true
    )
    @Column(
            name = "CREATED_TIME",
            nullable = true,
            updatable = false
    )
    private Date creationDate;
    @Basic(
            optional = true
    )
    @Column(
            name = "CREATOR_ID",
            nullable = true,
            updatable = false
    )
    private Long creator;
    @Temporal(TemporalType.TIMESTAMP)
    @Basic(
            optional = true
    )
    @Column(
            name = "LAST_UPDATED_TIME",
            nullable = true
    )
    private Date lastUpdate;
    @Basic(
            optional = true
    )
    @Column(
            name = "LAST_UPDATED_ID",
            nullable = true
    )
    private Long lastUpdater;
}
