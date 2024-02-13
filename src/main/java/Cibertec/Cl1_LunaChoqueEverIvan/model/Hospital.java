package Cibertec.Cl1_LunaChoqueEverIvan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hospitalId;

    private String hospitalName;
    private String hospitalAddress;
    private String hospitalPhoneNumber;
    private String state;
    private String zipCode;

   
}