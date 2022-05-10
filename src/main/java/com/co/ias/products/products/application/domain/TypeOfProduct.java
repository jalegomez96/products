package com.co.ias.products.products.application.domain;

import org.apache.commons.lang3.Validate;

public class TypeOfProduct {
    private final Integer value;

    public TypeOfProduct(Integer value) {
        Validate.notNull(value, "Type of product can not be null");
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
