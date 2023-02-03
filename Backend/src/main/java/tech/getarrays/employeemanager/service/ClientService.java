package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.exception.UserNotFoundException;
import tech.getarrays.employeemanager.model.Client;
import tech.getarrays.employeemanager.repo.ClientRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ClientService {
    // Referencia al repositorio de clientes
    private final ClientRepo clientRepo;

    // Inyección de dependencias mediante constructor
    @Autowired
    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    // Método para agregar un cliente nuevo
    public Client addClient(Client client) {
        // Asignar un código único al cliente
        client.setClientCode(UUID.randomUUID().toString());
        // Guardar el cliente en la base de datos
        return clientRepo.save(client);
    }

    // Método para obtener una lista con todos los clientes
    public List<Client> findAllClients() {
        return clientRepo.findAll();
    }

    // Método para actualizar un cliente existente
    public Client updateClient(Client client) {
        return clientRepo.save(client);
    }

    // Método para obtener un cliente por su ID
    public Client findClientById(Long id) {
        // Devolver el cliente encontrado o lanzar una excepción en caso de no existir
        return clientRepo.findClientById(id)
                .orElseThrow(() -> new UserNotFoundException("Empleado con ID " + id + " no encontrado"));
    }

    // Método para eliminar un cliente
    public void deleteClient(Long id){
        clientRepo.deleteClientById(id);
    }
}
