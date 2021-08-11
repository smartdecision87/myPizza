package com.company.pizza.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Table(name = "PIZZA_INGRIDIENT")
@Entity(name = "pizza_Ingridient")
public class Ingridient extends StandardEntity {
    private static final long serialVersionUID = -3824519935127808465L;

    @NotNull
    @JoinColumn(name = "PIZZA_ID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Pizza pizza;

    @JoinColumn(name = "TOPPING_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Topping topping;

    @NotNull
    @Column(name = "WEIGHT", nullable = false)
    @Min(0)
    private Integer weight;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}