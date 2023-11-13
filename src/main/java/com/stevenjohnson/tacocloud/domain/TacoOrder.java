package com.stevenjohnson.tacocloud.domain;

import java.util.List;

public record TacoOrder(
    String deliveryName,
    String deliveryStreet,
    String deliveryCity,
    String deliveryState,
    String deliveryZip,
    String ccNumber,
    String ccExpiration,
    String ccCVV,
    List<Taco> tacos

) {}
