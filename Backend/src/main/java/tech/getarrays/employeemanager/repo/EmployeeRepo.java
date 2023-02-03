package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee;

import java.util.Optional;
/**
 * Interfaz que extiende a JpaRepository para realizar operaciones CRUD en la base de datos.
 * Permite borrar un empleado por su id y buscar un empleado por su id.
 */
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    /**
     * Borra un empleado por su id.
     * @param id el id del empleado a borrar
     */
    void deleteEmployeeById(Long id);

    /**
     * Busca un empleado por su id.
     * @param id el id del empleado a buscar
     * @return un objeto de tipo Optional que contiene el empleado encontrado o un Optional vacío si no se encontró ningún empleado con ese id
     */
    Optional<Employee> findEmployeeById(Long id);
}