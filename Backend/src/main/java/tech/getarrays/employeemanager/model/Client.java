package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Clase Client, representa a un cliente en la aplicación.
 * @author tech.getarrays
 */
@Entity
public class Client implements Serializable {

    /**
     * Identificador único del cliente.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    /**
     * Nombre del cliente.
     */
    private String name;

    /**
     * Correo electrónico del cliente.
     */
    private String email;

    /**
     * Título de trabajo del cliente.
     */
    private String jobTitle;

    /**
     * Teléfono del cliente.
     */
    private String phone;

    /**
     * URL de la imagen del cliente.
     */
    private String imageUrl;

    /**
     * Código de cliente único.
     */
    @Column(nullable = false, updatable = false)
    private String clientCode;

    /**
     * Constructor vacío para la inicialización de objetos Client.
     */
    public Client() {}

    /**
     * Constructor con parámetros para la inicialización de objetos Client.
     * @param name Nombre del cliente.
     * @param email Correo electrónico del cliente.
     * @param jobTitle Título de trabajo del cliente.
     * @param phone Teléfono del cliente.
     * @param imageUrl URL de la imagen del cliente.
     * @param clientCode Código de cliente único.
     */
    public Client(String name, String email, String jobTitle, String phone, String imageUrl, String clientCode) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.clientCode = clientCode;
    }

    /**
     * Obtiene el identificador único del cliente.
     * @return Identificador único del cliente.
     */
    public Long getId() {
        return id;
    }

    /**
     * Asigna un valor al identificador único del cliente.
     * @param id Identificador único del cliente.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del cliente.
     * @return Nombre del cliente.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del cliente.
     * @param name El nombre del cliente.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el correo electrónico del cliente.
     * @return El correo electrónico del cliente.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del cliente.
     * @param email El correo electrónico del cliente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Devuelve el título del trabajo del cliente.
     * @return El título del trabajo del cliente.
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Establece el título del trabajo del cliente.
     * @param jobTitle El título del trabajo del cliente.
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Devuelve el número de teléfono del cliente.
     * @return El número de teléfono del cliente.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Establece el número de teléfono del cliente.
     * @param phone El número de teléfono del cliente.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Devuelve la URL de la imagen del cliente.
     * @return La URL de la imagen del cliente.
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Establece la URL de la imagen del cliente.
     * @param imageUrl La URL de la imagen del cliente.
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Devuelve el código de cliente.
     * @return El código de cliente.
     */
    public String getClientCode() {
        return clientCode;
    }

    /**
     * Establece el código de cliente.
     * @param clientCode El código de cliente.
     */
    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    /**

     Método toString que retorna la representación en cadena de caracteres del objeto Client
     @return String con los valores de las propiedades del objeto Client
     */
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
