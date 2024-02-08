package com.cafeteria;

/**
 *
 * @author Pedro
 */
public class Canela extends IngredienteDecorator {
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebidaDecorada.calculaCusto() + 0.75;
    }

    @Override
    public String getDescricao() {
        return bebidaDecorada.getDescricao() + ", com Canela";
    }
}
