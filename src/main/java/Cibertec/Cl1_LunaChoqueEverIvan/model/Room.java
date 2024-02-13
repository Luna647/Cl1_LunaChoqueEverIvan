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
@Table(name = "room")
public class Room {
    @Id
    private String roomNum;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "patient_Id",referencedColumnName = "patientId")
    private Patient patient;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "staff_Id",referencedColumnName = "staffId")
    private Staff staff;

    private LocalDate admissionDate;

    
}
