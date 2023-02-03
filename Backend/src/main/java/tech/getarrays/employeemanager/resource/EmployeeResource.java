package tech.getarrays.employeemanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.service.EmployeeService;

import java.util.List;

/**

 Clase recurso para manejar las solicitudes REST relacionadas a los empleados.
 */
@RestController
@RequestMapping("/employee")
public class EmployeeResource {
    private final EmployeeService employeeService;

    /**

     Constructor para inyectar dependencias.
     @param employeeService Servicio de empleado.
     */
    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    /**

     Método para obtener todos los empleados.
     @return Lista de empleados.
     */
    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees () {
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    /**

     Método para obtener un empleado por su ID.
     @param id ID del empleado.
     @return Empleado encontrado.
     */
    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById (@PathVariable("id") Long id) {
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    /**

     Método para agregar un empleado nuevo.
     @param employee Empleado a agregar.
     @return Empleado agregado.
     */
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }
    /**

     Método para actualizar un empleado existente.
     @param employee Empleado actualizado.
     @return Empleado actualizado.
     */
    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Employee updateEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    /**

     Método para eliminar un empleado por su ID.
     @param id ID del empleado a eliminar.
     @return HTTP status OK.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
