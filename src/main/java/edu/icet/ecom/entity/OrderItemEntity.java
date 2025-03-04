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
@Table(name = "OrderItems")
public class OrderItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //@ManyToOne
    //@JoinColumn(name = "orderId",referencedColumnName = "id",nullable = false)
    //private OrderEntity order;
    @Column(nullable = false)
    private Integer orderId;

    //@OneToOne
    //@JoinColumn(name = "productID", referencedColumnName = "id",nullable = false)
    //private ProductEntity product;
    @Column(nullable = false)
    private Integer productId;

    private Integer qty;
    private Double price;
    private Double discount;

//    "id",
//    "orderId",
//    "itemCode",
//    "qty",
//    "price",
//    "discount"
}
