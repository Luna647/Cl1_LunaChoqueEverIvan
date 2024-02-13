package Cibertec.Cl1_LunaChoqueEverIvan.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "prescription")
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prescriptionNum;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "patient_Id",referencedColumnName = "patientId")
    private Patient patient;

    private String medicationName;
    private LocalDate prescriptionDate;
    private double prescriptionCost;

  
}
