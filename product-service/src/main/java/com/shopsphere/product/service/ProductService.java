
package com.shopsphere.product.service;

import com.shopsphere.product.model.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final List<Product> products = List.of(
            new Product(1L, "Wireless Mouse",
                    "Wireless USB mouse", new BigDecimal("799.00")),
            new Product(2L, "Mechanical Keyboard",
                    "Compact mechanical keyboard", new BigDecimal("2499.00")),
            new Product(3L, "USB-C Hub",
                    "Multiport USB-C adapter", new BigDecimal("1599.00"))
    );

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(product -> product.id().equals(id))
                .findFirst();
    }
}
