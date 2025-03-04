package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderItem {
    private Integer id;
    private Integer orderId;
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
