package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private Integer id;
    private Integer customerId;
    private LocalDate date;
    private Double total;

//    "id",
//    "customerId",
//    "date",
//    "total"
}
