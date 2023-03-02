package bgnc.io.rentACar.model.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Table(name="cars")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Car {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;


    /*
    * Example Plate : 34 ONR 1997
    *  */
    @Column(name="plate")
    private String plate;


    /**
     * Example Daily Price : $100 or $100.59
     * */
    @Column(name="dailyPrice")
    private Double dailyPrice;


    /**
     * Model Year => 2019
     * **/
    @Column(name="modelYear")
    private int modelYear;


    /*
    * 2 => rented
    * 1=> available
    * 3=> maintenance
    *
    * */
    @Column(name="state")
    private int state;



    @ManyToOne
    @JoinColumn(name="model_id")
    private Model model;





}
