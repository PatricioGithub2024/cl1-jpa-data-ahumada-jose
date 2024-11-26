package pe.edu.i202224977.cl1_jpa_data_ahumada_jose.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "country")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Country {

    @Id
    @Column(name = "Code")
    private String code;
    @Column(name = "Name")
    private String name;
    @Column(name = "Continent")
    private String continent;
    @Column(name = "Region")
    private String region;
    @Column(name = "SurfaceArea")
    private Double surfaceArea;
    @Column(name = "IndepYear")
    private Integer indepYear;
    @Column(name = "Population")
    private Integer population;
    @Column(name = "LifeExpectancy")
    private Double lifeExpectancy;
    @Column(name = "GNP")
    private Double gNP;
    @Column(name = "GNPOld")
    private Double gNPOld;
    @Column(name = "LocalName")
    private String localName;
    @Column(name = "GovernmentForm")
    private String governmentForm;
    @Column(name = "HeadOfState")
    private String headOfState;
    @Column(name = "Capital")
    private Integer capital;
    @Column(name = "Code2")
    private String code2;


    //variable para City
    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @ToString.Exclude
    private List<City> cities;

    //variable para CountryLanguage
    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @ToString.Exclude
    private List<CountryLanguage> countrylanguages;

}
