package com.cafeteria;

/**
 *
 * @author Pedro
 */
public abstract class IngredienteDecorator implements Bebida {
    protected Bebida bebidaDecorada;

    public IngredienteDecorator(Bebida bebida) {
        this.bebidaDecorada = bebida;
    }

    public abstract String getDescricao();
}
