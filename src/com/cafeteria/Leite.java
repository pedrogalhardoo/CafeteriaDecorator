package com.cafeteria;

/**
 *
 * @author Pedro
 */
public class Leite extends IngredienteDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebidaDecorada.calculaCusto() + 0.50;
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + ", com Leite";
    }
}