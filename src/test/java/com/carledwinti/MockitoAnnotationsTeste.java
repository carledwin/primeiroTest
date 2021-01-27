package com.carledwinti;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

//Inicializa as variavies e contexto Mockito para teste
@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationsTeste {

    //outra forma de mockar uma variável
    @Mock
    List<String> lista;

    @Test
    public void segundoTesteMockito(){
        //scenario

        //mock
        Mockito.when(lista.size()).thenReturn(18);

        //execution
        int size = lista.size();

        //verification
        Assertions.assertThat(size).isEqualTo(18);

        //verify - verifica se o methodo foi chamado
        //Mockito.verify(lista).isEmpty(); //Test failed --> Wanted but not invoked: lista.isEmpty()
        Mockito.verify(lista).size();

        //times - verifica quantas vezes o methodo foi chamado nesta execução
        //Mockito.verify(lista, Mockito.times(2)).size(); //Test failed --> org.mockito.exceptions.verification.TooManyActualInvocations: lista.size()
        Mockito.verify(lista, Mockito.times(1)).size();

        //never - quando nao queremos que o method tenha sido chamado nenhuma vez
        //lista.isEmpty(); //Teste failed --> org.mockito.exceptions.verification.NeverWantedButInvoked
        Mockito.verify(lista, Mockito.never()).isEmpty();
    }

    @Test
    public void deveExecutarChamadasEmOrdem(){
        lista.size();
        lista.add("");
        //inOrder = verifica se alguns methods foram chamados e qual a ordem
        InOrder inOrder = Mockito.inOrder(lista);
        //inOrder.verify(lista).add("");//chamando primeiro add e depois size() //Test failed --> Wanted anywhere AFTER following interaction:
        inOrder.verify(lista).size();
        inOrder.verify(lista).add("");



    }
}
