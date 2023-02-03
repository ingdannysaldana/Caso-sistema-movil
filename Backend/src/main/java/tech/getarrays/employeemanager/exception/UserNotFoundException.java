package tech.getarrays.employeemanager.exception;

/**
 * Clase para manejar excepciones relacionadas con usuarios no encontrados.
 *
 */
public class UserNotFoundException extends RuntimeException {
    /**
     * Constructor que toma un mensaje como argumento y lo pasa a la superclase (RuntimeException).
     *
     */
    public UserNotFoundException(String message) {
        super(message);
    }
}