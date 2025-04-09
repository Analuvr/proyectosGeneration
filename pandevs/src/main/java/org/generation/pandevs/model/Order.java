package org.generation.pandevs.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

// id_order, date_order, total_order
@Entity (name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Long idOrder;

    @Column(name = "date_order", nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime dateOrder;

    @Column(name = "total_order", nullable = false, columnDefinition = "DECIMAL(7,2)")
    private Double totalOrder;

    public Order() {
    }

    public Order(Long idOrder, LocalDateTime dateOrder, Double totalOrder) {
        this.idOrder = idOrder;
        this.dateOrder = dateOrder;
        this.totalOrder = totalOrder;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public LocalDateTime getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(LocalDateTime dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Double getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(Double totalOrder) {
        this.totalOrder = totalOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", dateOrder=" + dateOrder +
                ", totalOrder=" + totalOrder +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(idOrder, order.idOrder) && Objects.equals(dateOrder, order.dateOrder) && Objects.equals(totalOrder, order.totalOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrder, dateOrder, totalOrder);
    }

    @ManyToOne
    @JoinColumn(name = "order_id_user")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
