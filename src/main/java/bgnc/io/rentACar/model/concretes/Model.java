package bgnc.io.rentACar.model.concretes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.*;

@Table(name="models")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Model {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @ManyToOne
    private Brand brand;




}
