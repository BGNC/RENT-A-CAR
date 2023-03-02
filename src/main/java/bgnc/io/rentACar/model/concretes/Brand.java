package bgnc.io.rentACar.model.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Table(name = "brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Brand {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;


    @OneToMany
    List<Model> models;

}
