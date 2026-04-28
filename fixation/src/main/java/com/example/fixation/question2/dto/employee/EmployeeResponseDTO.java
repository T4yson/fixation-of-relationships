package com.example.fixation.question2.dto.employee;

import com.example.fixation.question2.dto.address.AddressRequestDTO;

public record EmployeeResponseDTO(Long id, String name, AddressRequestDTO addrss) {}
