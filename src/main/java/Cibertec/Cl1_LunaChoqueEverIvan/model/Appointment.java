package Cibertec.Cl1_LunaChoqueEverIvan.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "appointment")
public class Appointment {
  
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointmentId;
	
    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "patient_Id", referencedColumnName = "patientId")
    private Patient patient;

   
    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "doctor_Id", referencedColumnName = "doctorId")
    private Doctor doctor;

    private LocalDate date;
    private LocalTime time;

    
}
