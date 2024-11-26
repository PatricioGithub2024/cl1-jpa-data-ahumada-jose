package pe.edu.i202224977.cl1_jpa_data_ahumada_jose.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "countrylanguage")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguagePk countryLanguagePk;

    @Column(name = "IsOfficial")
    private String isOfficial;
    @Column(name = "Percentage")
    private Double percentage;


    //variable de la llave foranea
    @ManyToOne
    @JoinColumn(name = "CountryCode")
    @MapsId("countryCode")
    private Country country;
}
