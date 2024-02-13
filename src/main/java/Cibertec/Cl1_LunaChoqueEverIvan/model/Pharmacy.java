package Cibertec.Cl1_LunaChoqueEverIvan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pharmacy")
public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pharmacyId;

    private String pharmacyName;
    private String pharmacyAddress;
    private String pharmacyPhoneNumber;

   
}

