package com.cafeteria;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Cafeteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bebida bebida = null;
        
        while (bebida == null) {
            System.out.println("Escolha a base da sua bebida: \n 1 - Espresso (1.99) \n 2 - Descafeinado (1.05)");
            int baseEscolhida = scanner.nextInt();
            
            switch (baseEscolhida) {
                case 1:
                    bebida = new Espresso();
                    break;
                case 2:
                    bebida = new Decaf();
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        }
        
        boolean adicionando = true;
        while (adicionando) {
            System.out.println("Escolha um ingrediente para adicionar: \n 1 - Leite (0.50) \n 2 - Canela (0.75) \n 3 - Chocolate (0.90) \n 0 - Finalizar Pedido");
            int escolha = scanner.nextInt();
            
            switch (escolha) {
                case 1:
                    bebida = new Leite(bebida);
                    break;
                case 2:
                    bebida = new Canela(bebida);
                    break;
                case 3:
                    bebida = new Chocolate(bebida);
                    break;
                case 0:
                    adicionando = false;
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        }
        
        System.out.println(bebida.getDescricao() + " custa $" + bebida.calculaCusto());
        
        scanner.close();
    }
}
