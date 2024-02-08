package com.cafeteria;

/**
 *
 * @author Pedro
 */
public class Espresso implements Bebida {
    @Override
    public double calculaCusto() {
        return 1.99;
    }

    @Override
    public String getDescricao() {
        return "Espresso";
    }
}
