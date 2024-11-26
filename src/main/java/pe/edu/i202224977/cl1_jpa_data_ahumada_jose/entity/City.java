package pe.edu.i202224977.cl1_jpa_data_ahumada_jose.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "city")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer iD;
    @Column(name = "Name")
    private String name;
    @Column(name = "District")
    private String district;
    @Column(name = "Population")
    private Integer population;


    //variable para la llave foranea
    @ManyToOne
    @JoinColumn(name = "CountryCode")
    private Country country;
}
