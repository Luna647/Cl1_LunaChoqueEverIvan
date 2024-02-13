package Cibertec.Cl1_LunaChoqueEverIvan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int staffId;

    private String staffFname;
    private String staffLname;
    private String staffAddress;
    private String staffPhoneNumber;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "department_Id",referencedColumnName = "departmentId")
    private Department department;

}
