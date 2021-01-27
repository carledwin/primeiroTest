package com.carledwinti;

//JUnit4
import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

    //teste
    @Test
    public void estruturaDeUmTeste(){
        //cenário
        int numero1=10, numero2 = 5;

        System.out.println("numero1: " + numero1 + ", numero2: " + numero2);

        //execução
        int resultado = numero1 + numero2;

        //verificação
        int esperado = 15;
        Assert.assertEquals(esperado, resultado);
    }
}
