package com.carledwinti;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTeste {

    //para utilizar na inicialização de cada teste com o auxilio do @Before
    Calculadora calculadora;

    @Before
    public void setUp(){
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomarDoisNumeros(){
        int resultado = calculadora.soma(10, 5);
        Assertions.assertThat(resultado).isEqualTo(15);
    }

    @Test(expected = RuntimeException.class)
    public void naoDevePermitirSomaDoisNumerosSendoUmPeloMenosNegativo(){
        calculadora.soma(-10, 5);
    }

    @Test
    public void deveSubtrairDoisNumeros(){
        int resultado = calculadora.subtrai(15,8);
        Assertions.assertThat(resultado).isEqualTo(7);
    }

    @Test(expected = RuntimeException.class)
    public void naoDevePermitirSubtracaoDoisNumerosSendoUmPeloMenosNegativo(){
        calculadora.subtrai(-10, 5);
    }

    @Test
    public void deveMultiplicarDoisNumeros(){
        int resultado = calculadora.multiplica(9, 8);
        Assertions.assertThat(resultado).isEqualTo(72);
    }

    @Test(expected = RuntimeException.class)
    public void naoDevePermitirMultiplicacaoDoisNumerosSendoUmPeloMenosNegativo(){
        calculadora.subtrai(-10, 5);
    }

    @Test
    public void deveDividirDoisNumeros(){
        int resultado = calculadora.divide(32,4);
        Assertions.assertThat(resultado).isEqualTo(8);
    }

    @Test(expected = RuntimeException.class)
    public void naoDevePermitirDivisaoDoisNumerosSendoUmPeloMenosNegativo(){
        calculadora.subtrai(-10, 5);
    }

    @Test(expected = RuntimeException.class)
    public void naoDevePermitirDivisaoPorZero(){
        calculadora.divide(32,0);
    }

    @Test
    public void devePermitirDivisaoZeroPorAlgumNumero(){
        int resultado = calculadora.divide(0,4);
        Assertions.assertThat(resultado).isEqualTo(0);
    }

}
