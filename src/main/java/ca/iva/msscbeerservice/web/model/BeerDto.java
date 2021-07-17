package ca.iva.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created By iVa on 7/16/2021.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private Integer version;
    private OffsetDateTime createdDate;
    private OffsetDateTime modifiedDate;

    private String beerName;

    private BeerStyleEnum beerStyleEnum;

    private Long upc;

    private BigDecimal price;

    private  Integer quantityOnHand;
}
