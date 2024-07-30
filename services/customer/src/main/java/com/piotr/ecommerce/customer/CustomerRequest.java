package com.piotr.ecommerce.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CustomerRequest(
        String id,
        @NotBlank(message = "First name is mandatory")
        String firstName,
        @NotBlank(message = "Last name is mandatory")
        String lastName,
        @NotBlank(message = "Email is mandatory")
        @Email(message = "Email should be valid")
        String email,
        Address address
) {
}
