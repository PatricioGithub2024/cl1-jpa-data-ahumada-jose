package pe.edu.i202224977.cl1_jpa_data_ahumada_jose;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202224977.cl1_jpa_data_ahumada_jose.entity.Country;
import pe.edu.i202224977.cl1_jpa_data_ahumada_jose.entity.CountryLanguage;
import pe.edu.i202224977.cl1_jpa_data_ahumada_jose.entity.CountryLanguagePk;
import pe.edu.i202224977.cl1_jpa_data_ahumada_jose.repository.CountryRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SpringBootApplication
public class Cl1JpaDataAhumadaJoseApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataAhumadaJoseApplication.class, args);
	}


	@Override
	@Transactional
	public void run(String... args) throws Exception {


		// Buscar el país con código "ARG"
		Optional<Country> optional = countryRepository.findById("ARG");
		optional.ifPresentOrElse(
				(country) -> {
					System.out.println("************Lenguajes en Argentina**********");

					country.getCountrylanguages().forEach(language -> {
						System.out.println(language.getCountryLanguagePk().getLanguage());
					});

				},
				() -> {
					System.out.println("Busqueda de paises de PERU");
					Optional<Country> optional2 = countryRepository.findById("PER");
					optional2.ifPresentOrElse(
							(country) -> {
								System.out.println("************Lenguajes en Perú**********");
								country.getCountrylanguages().forEach(language -> {
									System.out.println(language.getCountryLanguagePk().getLanguage());
								});
							},
							() -> {
								System.out.println("Ninguno de los paises solicitados existe");
							});

				});

		//eliminar

//		String id = "ARG";
//		if (countryRepository.existsById(id)){
//			countryRepository.deleteById(id);
//		} else {
//			System.out.println("Elemento de id " + id + " fue eliminado correctamente");
//		}

//		String id = "COL";
//		if (countryRepository.existsById(id)){
//			countryRepository.deleteById(id);
//		} else {
//			System.out.println("Elemento de id " + id + " fue eliminado correctamente");
//		}

		/**
		 * deleteAllById

		//eliminar varios
		List<String> ids = List.of("ARG","COL");

		List<String> idsExistentes= ids.stream().filter(countryRepository::existsById).collect(Collectors.toList());

		if(!idsExistentes.isEmpty()){
			countryRepository.deleteAllById(idsExistentes);
		} else {
			System.out.println("Ids no existe en BD");
		}*/


	}
}
