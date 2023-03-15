package de.neuefische.hhjava231springordersystem;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    private String id;
    private List<Product> products;


}
