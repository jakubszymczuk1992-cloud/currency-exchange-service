package com.jszymczuk.microservices.currencyexchangeservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class CurrencyExchange {

    @EqualsAndHashCode.Exclude
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private String environment;
}
