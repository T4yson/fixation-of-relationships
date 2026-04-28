package com.example.fixation.question2.dto.address;

import jakarta.validation.constraints.NotBlank;

public record AddressRequestDTO (

    @NotBlank(message = "Street is required") String street,
    @NotBlank(message = "Number is required") String number
) {}
