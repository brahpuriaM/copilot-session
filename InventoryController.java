import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
class InventoryController {

    private final List<Item> items = Arrays.asList(
            new Item("1", "Laptop", "Electronics"),
            new Item("2", "Smartphone", "Electronics"),
            new Item("3", "Table", "Furniture"),
            new Item("4", "Chair", "Furniture")
    );

    @GetMapping("/items/category/{category}")
    public List<Item> getItemsByCategory(@PathVariable String category) {
        return items.stream()
                .filter(item -> item.getCategory().equalsIgnoreCase(category))
                .toList();
    }
}
