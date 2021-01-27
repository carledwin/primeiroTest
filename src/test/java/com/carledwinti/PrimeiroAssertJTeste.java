package com.carledwinti;

//JUnit4
//import org.junit.Assert;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

public class PrimeiroAssertJTeste {

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
        //Assert.assertEquals(esperado, resultado);
        Assertions.assertThat(resultado).isBetween(14,16);
        Assertions.assertThat(resultado).isGreaterThan(10);
        Assertions.assertThat(resultado).isEqualTo(15);

        System.out.println("resultado: " + resultado);
    }
}
