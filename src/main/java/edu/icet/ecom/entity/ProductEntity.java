package edu.icet.ecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    private String itemCode;
    private String name;
    private String categoryId;
    private Double price;
    private Double discount;
    private String img;

//    "itemCode",
//    "name",
//    "categoryId",
//    "price",
//    "discount",
//    "img"
}
