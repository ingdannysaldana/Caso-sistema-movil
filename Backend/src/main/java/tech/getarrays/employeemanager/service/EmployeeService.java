package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.exception.UserNotFoundException;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.repo.EmployeeRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {
    // Referencia al repositorio de empleados
    private final EmployeeRepo employeeRepo;

    // Inyección de dependencias mediante constructor
    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    // Método para agregar un empleado nuevo
    public Employee addEmployee(Employee employee) {
        // Asignar un código único al empleado
        employee.setEmployeeCode(UUID.randomUUID().toString());
        // Guardar el empleado en la base de datos
        return employeeRepo.save(employee);
    }

    // Método para obtener una lista con todos los empleados
    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    // Método para actualizar un empleado existente
    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    // Método para obtener un empleado por su ID
    public Employee findEmployeeById(Long id) {
        // Devolver el empleado encontrado o lanzar una excepción en caso de no existir
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("Empleado con ID " + id + " no encontrado"));
    }

    // Método para eliminar un empleado
    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }
}
