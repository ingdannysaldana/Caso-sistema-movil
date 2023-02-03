package tech.getarrays.employeemanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.model.Client;
import tech.getarrays.employeemanager.service.ClientService;

import java.util.List;

/**

 Clase recurso para manejar las solicitudes REST relacionadas a los clientes.
 */
@RestController
@RequestMapping("/client")
public class ClientResource {
    private final ClientService clientService;

    /**

     Constructor para inyectar dependencias.
     @param clientService Servicio de cliente.
     */
    public ClientResource(ClientService clientService) {
        this.clientService = clientService;
    }
    /**

     Método para obtener todos los clientes.
     @return Lista de clientes.
     */
    @GetMapping("/all")
    public ResponseEntity<List<Client>> getAllClients () {
        List<Client> clients = clientService.findAllClients();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }
    /**

     Método para obtener un cliente por su ID.
     @param id ID del cliente.
     @return Empleado encontrado.
     */
    @GetMapping("/find/{id}")
    public ResponseEntity<Client> getClientById (@PathVariable("id") Long id) {
        Client client = clientService.findClientById(id);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }
    /**

     Método para agregar un cliente nuevo.
     @param client Empleado a agregar.
     @return Empleado agregado.
     */
    @PostMapping("/add")
    public ResponseEntity<Client> addClient(@RequestBody Client client) {
        Client newClient = clientService.addClient(client);
        return new ResponseEntity<>(newClient, HttpStatus.CREATED);
    }
    /**

     Método para actualizar un cliente existente.
     @param client Empleado actualizado.
     @return Empleado actualizado.
     */
    @PutMapping("/update")
    public ResponseEntity<Client> updateClient(@RequestBody Client client) {
        Client updateClient = clientService.updateClient(client);
        return new ResponseEntity<>(updateClient, HttpStatus.OK);
    }

    /**

     Método para eliminar un cliente por su ID.
     @param id ID del cliente a eliminar.
     @return HTTP status OK.
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable("id") Long id) {
        clientService.deleteClient(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
