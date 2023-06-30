package com.example.crud.domain.product;

import org.springframework.lang.NonNull;

public record RequestProductDTO(
        Long id,

        @NonNull
        String name,

        @NonNull
        Integer price_in_cents) {


}
