package kz.springpro.msscbakery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BakeryDto {
    private UUID id;
    private String name;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastDateModified;
    private BakeryTypeEnum bakeryType;
    private Double calorie;
    private Long upc;
    private BigDecimal price;
    private Integer quantity;

}
