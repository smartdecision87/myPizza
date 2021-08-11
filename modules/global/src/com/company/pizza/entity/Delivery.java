package com.company.pizza.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.cuba.core.entity.EmbeddableEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@MetaClass(name = "pizza_Delivery")
@Embeddable
public class Delivery extends EmbeddableEntity {
    private static final long serialVersionUID = 4615609907448565211L;

    @JoinColumn(name = "COURIER_ID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @NotNull
    private User courier;

    @NotNull
    @Column(name = "CLIENT_NAME", nullable = false)
    private String clientName;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, unique = true)
    private Integer phoneNumber;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    @Pattern(regexp = "^*@*\\.\\w{2,3}$")
    private String email;

    @NotNull
    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "COMMENT_")
    @Lob
    private String comment;

    public void setCourier(User courier) {
        this.courier = courier;
    }

    public User getCourier() {
        return courier;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

}