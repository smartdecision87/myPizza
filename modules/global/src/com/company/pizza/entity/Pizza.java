package com.company.pizza.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.global.ClientType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "PIZZA_PIZZA")
@Entity(name = "pizza_Pizza")
@NamePattern("%s|name")
public class Pizza extends StandardEntity {
    private static final long serialVersionUID = 4186425602332203836L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @NotNull
    @Column(name = "CALORIES", nullable = false)
    private Integer calories;

    @NotNull
    @Lob
    @Column(name = "INGRIDIENTS", nullable = false)
    private String ingridients;

    @Lob
    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SIZE_", nullable = false)
    @NotNull
    private String size;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;

    public void setSize(ClientType size) {
        this.size = size == null ? null : size.getId();
    }

    public ClientType getSize() {
        return size == null ? null : ClientType.fromId(size);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public String getIngridients() {
        return ingridients;
    }

    public void setIngridients(String ingridients) {
        this.ingridients = ingridients;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}