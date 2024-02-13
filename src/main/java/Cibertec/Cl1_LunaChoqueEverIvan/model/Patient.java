package Cibertec.Cl1_LunaChoqueEverIvan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;

    private String patientFname;
    private String patientLname;
    private String patientAddress;
    private String patientPhoneNumber;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "pharmacy_Id",referencedColumnName = "pharmacyId")
    private Pharmacy pharmacy;

  
}
