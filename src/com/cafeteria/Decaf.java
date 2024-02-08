package com.cafeteria;

/**
 *
 * @author Pedro
 */
public class Decaf implements Bebida {
    @Override
    public double calculaCusto() {
        return 1.05;
    }

    @Override
    public String getDescricao() {
        return "Decaf";
    }
}