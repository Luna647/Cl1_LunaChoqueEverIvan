package Cibertec.Cl1_LunaChoqueEverIvan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorId;

    private String doctorFname;
    private String doctorLname;
    private String doctorPhoneNumber;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "department_Id",referencedColumnName = "departmentId")
    private Department department;

  
}
