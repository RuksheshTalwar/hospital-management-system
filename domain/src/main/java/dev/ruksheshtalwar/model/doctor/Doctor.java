package dev.ruksheshtalwar.model.doctor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Doctor {

    @Id
    private int id;
    private String name;
    private String specialist;

    public Doctor(int id, String name, String specialist) {
        this.id = id;
        this.name = name;
        this.specialist = specialist;
    }
}
