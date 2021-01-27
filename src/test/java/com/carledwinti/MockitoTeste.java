package com.carledwinti;

import org.assertj.core.api.Assertions;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class MockitoTeste {

    @Test
    public void primeiroTesteMockito(){
        //scenario
        List<String> lista = Mockito.mock(ArrayList.class);
        List<String> listaDefault = Mockito.mock(ArrayList.class);

        //mock - mock sempre retornará o valor default de um campo a menos que eu defina um valor de retorno
        Mockito.when(lista.size()).thenReturn(20);

        //execute
        int size = lista.size();
        int sizeDefault = listaDefault.size();

        //verification
        Assertions.assertThat(size).isEqualTo(20);
        Assertions.assertThat(sizeDefault).isEqualTo(0);

    }
}
