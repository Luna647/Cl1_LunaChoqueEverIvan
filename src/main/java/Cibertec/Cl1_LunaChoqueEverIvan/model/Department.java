package Cibertec.Cl1_LunaChoqueEverIvan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;

    private String departmentName;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "hospital_Id",referencedColumnName = "hospitalId")
    private Hospital hospital;

}
