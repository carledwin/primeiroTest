package com.carledwinti;

public class Calculadora {

    public int soma(int numero1, int numero2){
        if(numero1 < 0 || numero2 < 0){
            throw new RuntimeException("Não é permitido somar numeros negativos.");
        }
        return numero1 + numero2;
    }

    public int subtrai(int numero1, int numero2){
        if(numero1 < 0 || numero2 < 0){
            throw new RuntimeException("Não é permitido subtrair numeros negativos.");
        }
        return numero1 - numero2;
    }

    public int multiplica(int numero1, int numero2){
        if(numero1 < 0 || numero2 < 0){
            throw new RuntimeException("Não é permitido multiplicar numeros negativos.");
        }
        return numero1 * numero2;
    }

    public int divide(int numero1, int numero2){
        if(numero1 < 0 || numero2 < 0){
            throw new RuntimeException("Não é permitido dividir numeros negativos.");
        }

        if(numero2 == 0){
            throw new RuntimeException("Não é permitido dividir por ZERO.");
        }

        return numero1 / numero2;
    }

}
