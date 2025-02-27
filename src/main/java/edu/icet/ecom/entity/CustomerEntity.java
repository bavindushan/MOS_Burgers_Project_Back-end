package edu.icet.ecom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private String occupation;
    private String gender;
    private String location;
    private String email;

    @Column(unique = true,nullable = false)
    private String phoneNumber;
    private String additionalInfo;
}
