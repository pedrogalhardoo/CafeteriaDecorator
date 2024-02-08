package com.cafeteria;

/**
 *
 * @author Pedro
 */
public class Chocolate extends IngredienteDecorator {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebidaDecorada.calculaCusto() + 0.90;
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + ", com Chocolate";
    }
}