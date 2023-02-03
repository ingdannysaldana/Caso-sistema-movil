package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Clase Employee, representa a un empleado en la aplicación.
 * @author tech.getarrays
 */
@Entity
public class Employee implements Serializable {

    /**
     * Identificador único del empleado.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    /**
     * Nombre del empleado.
     */
    private String name;

    /**
     * Correo electrónico del empleado.
     */
    private String email;

    /**
     * Título de trabajo del empleado.
     */
    private String jobTitle;

    /**
     * Teléfono del empleado.
     */
    private String phone;

    /**
     * URL de la imagen del empleado.
     */
    private String imageUrl;

    /**
     * Código de empleado único.
     */
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    /**
     * Constructor vacío para la inicialización de objetos Employee.
     */
    public Employee() {}

    /**
     * Constructor con parámetros para la inicialización de objetos Employee.
     * @param name Nombre del empleado.
     * @param email Correo electrónico del empleado.
     * @param jobTitle Título de trabajo del empleado.
     * @param phone Teléfono del empleado.
     * @param imageUrl URL de la imagen del empleado.
     * @param employeeCode Código de empleado único.
     */
    public Employee(String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }

    /**
     * Obtiene el identificador único del empleado.
     * @return Identificador único del empleado.
     */
    public Long getId() {
        return id;
    }

    /**
     * Asigna un valor al identificador único del empleado.
     * @param id Identificador único del empleado.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del empleado.
     * @return Nombre del empleado.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del empleado.
     * @param name El nombre del empleado.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el correo electrónico del empleado.
     * @return El correo electrónico del empleado.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del empleado.
     * @param email El correo electrónico del empleado.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Devuelve el título del trabajo del empleado.
     * @return El título del trabajo del empleado.
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Establece el título del trabajo del empleado.
     * @param jobTitle El título del trabajo del empleado.
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Devuelve el número de teléfono del empleado.
     * @return El número de teléfono del empleado.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Establece el número de teléfono del empleado.
     * @param phone El número de teléfono del empleado.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Devuelve la URL de la imagen del empleado.
     * @return La URL de la imagen del empleado.
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Establece la URL de la imagen del empleado.
     * @param imageUrl La URL de la imagen del empleado.
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Devuelve el código de empleado.
     * @return El código de empleado.
     */
    public String getEmployeeCode() {
        return employeeCode;
    }

    /**
     * Establece el código de empleado.
     * @param employeeCode El código de empleado.
     */
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    /**

     Método toString que retorna la representación en cadena de caracteres del objeto Employee
     @return String con los valores de las propiedades del objeto Employee
     */
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
    }
