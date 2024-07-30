package com.piotr.ecommerce.customer;

import java.util.List;

public interface CustomerService {
    String createCustomer(CustomerRequest request);

    void updateCustomer(CustomerRequest request);

    List<CustomerResponse> findAll();

    Boolean existsById(String customerId);

    CustomerResponse findById(String customerId);

    void deleteCustomer(String customerId);
}
