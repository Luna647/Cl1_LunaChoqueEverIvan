package Cibertec.Cl1_LunaChoqueEverIvan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invoiceNum;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "patient_Id",referencedColumnName = "patientId")
    private Patient patient;

    private String serviceDescription;
    private double cost;
    private double total;

    
}
