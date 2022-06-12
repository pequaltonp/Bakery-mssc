package kz.springpro.msscbakery.entities;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Bakery {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
    private UUID id;

    @Version
    private Long version;

    private String bakeryName;

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdDate;

    @CreationTimestamp
    private Timestamp lastDateModified;

    private String bakeryType;

    private Double calorie;

    @Column(unique = true)
    private Long upc;

    private BigDecimal price;

    private Integer quantity;
}
