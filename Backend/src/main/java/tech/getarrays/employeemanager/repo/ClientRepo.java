package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Client;

import java.util.Optional;
/**
 * Interfaz que extiende a JpaRepository para realizar operaciones CRUD en la base de datos.
 * Permite borrar un cliente por su id y buscar un cliente por su id.
 */
public interface ClientRepo extends JpaRepository<Client, Long> {
    /**
     * Borra un cliente por su id.
     * @param id el id del cliente a borrar
     */
    void deleteClientById(Long id);

    /**
     * Busca un cliente por su id.
     * @param id el id del cliente a buscar
     * @return un objeto de tipo Optional que contiene el cliente encontrado o un Optional vacío si no se encontró ningún empleado con ese id
     */
    Optional<Client> findClientById(Long id);
}