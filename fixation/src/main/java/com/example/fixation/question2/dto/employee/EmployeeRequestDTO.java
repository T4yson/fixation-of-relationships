package com.example.fixation.question2.dto.employee;

import com.example.fixation.question2.dto.address.AddressRequestDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EmployeeRequestDTO (

        @NotBlank(message = "Name is required") String name,
        @NotNull(message = "Address is required") @Valid AddressRequestDTO address
) {}
