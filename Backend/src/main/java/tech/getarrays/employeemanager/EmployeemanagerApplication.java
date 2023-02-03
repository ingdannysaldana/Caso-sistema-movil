package tech.getarrays.employeemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class EmployeemanagerApplication {

	/**
	 * Método principal que inicia la aplicación.
	 *
	 * @param args argumentos opcionales para la ejecución.
	 */
	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagerApplication.class, args);
	}

	/**
	 * Configuración de filtro de CORS.
	 *
	 * @return instancia de CorsFilter
	 */
	@Bean
	public CorsFilter corsFilter() {
		// Configuración de Cors
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		// Habilitar credenciales
		corsConfiguration.setAllowCredentials(true);
		// Configurar orígenes permitidos
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		// Configurar headers permitidos
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
		// Configurar headers expuestos
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
		// Configurar métodos permitidos
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		// Configuración basada en url de Cors
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		// Registrar configuración en todas las urls
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		// Devolver instancia de CorsFilter
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}

}
