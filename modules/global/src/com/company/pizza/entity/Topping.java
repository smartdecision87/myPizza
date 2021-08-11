package com.company.pizza.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "PIZZA_TOPPING")
@Entity(name = "pizza_Topping")
@NamePattern("%s|name")
public class Topping extends StandardEntity {
    private static final long serialVersionUID = 6059941593812936302L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @Column(name = "IS_SPICY", nullable = false)
    @NotNull
    private Boolean isSpicy = false;

    public void setIsSpicy(Boolean isSpicy) {
        this.isSpicy = isSpicy;
    }

    public Boolean getIsSpicy() {
        return isSpicy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}