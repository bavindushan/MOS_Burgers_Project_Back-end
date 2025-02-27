package edu.icet.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private Integer id; // (INT, Primary Key, Auto Increment)
    //private String img;
    private String firstName;
    private String lastName;
    private String occupation;
    private String gender;
    private String location;
    private String email;
    private String phoneNumber;
    private String additionalInfo;

//    "customerID",
//    "firstName",
//    "lastName",
//    "occupation",
//    "gender",
//    "location",
//    "email",
//    "phoneNumber",
//    "additionalInfo"
}
