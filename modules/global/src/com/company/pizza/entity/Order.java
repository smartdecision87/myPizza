package com.company.pizza.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.global.ClientType;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "PIZZA_ORDER")
@Entity(name = "pizza_Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 7434331762778569833L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    private Integer number;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "CREATEDDATE_", nullable = false)
    private Date createdDate;

    @NotNull
    @Column(name = "STATUS", nullable = false)
    private String status;

    @Column(name = "TOTALAMOUNT_", nullable = false)
    @Min(0)
    @NotNull
    private Integer totalAmount;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DELIVER_ID")
    private Order deliver;

    public void setStatus(ClientType status) {
        this.status = status == null ? null : status.getId();
    }

    public ClientType getStatus() {
        return status == null ? null : ClientType.fromId(status);
    }

    public Order getDeliver() {
        return deliver;
    }

    public void setDeliver(Order deliver) {
        this.deliver = deliver;
    }

    public Integer getSum() {
        return totalAmount;
    }

    public void setSum(Integer sum) {
        this.totalAmount = sum;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}