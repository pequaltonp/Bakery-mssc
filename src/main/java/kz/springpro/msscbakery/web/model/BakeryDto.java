package kz.springpro.msscbakery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BakeryDto {
    private UUID id;
    private String name;
    private String typeOfProduct;
    private Double calorie;
    private Long upc;


}
