package pe.edu.i202224977.cl1_jpa_data_ahumada_jose.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountryLanguagePk {

    @Column(name = "CountryCode")
    private String countryCode;
    @Column(name = "Language")
    private String language;

}
