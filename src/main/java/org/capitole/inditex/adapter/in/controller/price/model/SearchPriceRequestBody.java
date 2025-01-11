package org.capitole.inditex.adapter.in.controller.price.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class SearchPriceRequestBody {
    private Long brandId;
    private Long productId;
    private Instant effectiveDate;
}
