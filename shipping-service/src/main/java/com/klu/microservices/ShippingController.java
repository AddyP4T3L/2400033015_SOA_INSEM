package com.klu.microservices;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {

    @GetMapping("/shipping")
    public Map<String, Object> getShipping() {
        return Map.of(
            "service", "Shipping Service",
            "method", "Standard Delivery",
            "estimatedDays", 3,
            "status", "In Transit"
        );
    }
}
