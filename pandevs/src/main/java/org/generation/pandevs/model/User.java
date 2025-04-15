package org.generation.pandevs.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity // Anotar esta clase  como una entidad
@Table(name = "users") // Especificar información adicional que podemos manipular (nombre de la tabla, si no se establece nombre, toma el de la clase)
public class User {

    @Id // Anotación que establece la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Estrategia ligada a ID para generar un valor (IDENTITY: características de autoincrementable, única y not null)
    @Column(name = "id_user") // Será una columna de la tabla (si no se establecen nombres, toma los del atributo)
    private Long id;

    @Column(length = 50, nullable = false, unique = true) // El campo username tiene una longitud de 50 (VARCHAR(50)), no es nulo (Not Null) y es único (Unique)
    private String username;

    @Column(length = 70, nullable = false, unique = true)
    private String email;

    @Column(length = 120, nullable = false)
    private String password;

    // Constructor vacío para JPA
    public User() {
    }

    public User(Long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User user)) return false;
        return Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @OneToMany(mappedBy = "user")
    private List<Order> orders;
    //Como esta encapsulada se agrega metodo get y set
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
