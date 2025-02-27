package edu.icet.ecom.entity;

import jakarta.persistence.*;
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
    private String id;

    @Column(unique = true)
    private String name;
//    @ManyToOne
//    @JoinColumn(name = "categoryId", referencedColumnName = "id",nullable = false)
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
