
package com.klu.microservices;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @GetMapping("/inventory")
    public Map<String, Object> getInventory() {
        return Map.of(
            "service", "Inventory Service",
            "product", "Laptop",
            "stock", 50,
            "status", "Available"
        );
    }
}
