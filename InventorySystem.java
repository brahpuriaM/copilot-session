// REST API to fetch inventory items based on category
// Example 2 (Java) – REST API to Fetch Inventory Items Based on Category
// Scenario: Walmart needs a REST API to fetch inventory items based on their category.
// This API will allow users to retrieve items from the inventory by specifying a category, such as "Electronics" or "Furniture".

// Example 2 (Java) – REST API to Fetch Inventory Items Based on Category





import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class InventorySystem {

    public static void main(String[] args) {
        SpringApplication.run(InventorySystem.class, args);
    }
}

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

class Item {
    private String id;
    private String name;
    private String category;

    public Item(String id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}