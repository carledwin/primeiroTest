package com.carledwinti;

import com.carledwinti.exception.PessoaInexistenteException;
import com.carledwinti.exception.PessoasNulaException;
import com.carledwinti.exception.PessoasSemNomeException;
import com.carledwinti.model.CadastroPessoas;
import com.carledwinti.model.Pessoa;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class CadastroPessoasTeste {

    CadastroPessoas cadastroPessoas;
    Pessoa pessoa;

    @Before
    public void setUp(){
        //cenario
        cadastroPessoas = new CadastroPessoas();
        pessoa = new Pessoa();
    }

    @Test
    public void deveCriarCadastroDePessoas(){
        //cenario

        //execução
        List<Pessoa> pessoas = cadastroPessoas.getPessoas();

        //verificação
        Assertions.assertThat(pessoas).isEmpty();
    }

    @Test
    public void deveAdicionarUmaPessoa(){
        //cenario
        pessoa.setNome("Gen");

        //execucao
        cadastroPessoas.adiciona(pessoa);

        //verificacao
        Assertions.assertThat(cadastroPessoas.getPessoas())
                .isNotEmpty()
                .hasSize(1)
                .contains(pessoa);
    }

    //verificacao
    @Test(expected = PessoasSemNomeException.class)
    public void naoDeveAdicionarPessoaSemNome(){
        //cenario

        //execuçao
        cadastroPessoas.adiciona(pessoa);
    }

    //verificacao
    @Test(expected = PessoasNulaException.class)
    public void naoDeveAdicionarPessoaNulla(){
        //cenario
        pessoa = null;
        //execuçao
        cadastroPessoas.adiciona(pessoa);
    }

    @Test
    public void deveRemoverUmaPessoa(){
        //cenario
        pessoa.setNome("Blahan");
        cadastroPessoas.adiciona(pessoa);

        //execucao
        cadastroPessoas.remove(pessoa);
        Assertions.assertThat(cadastroPessoas.getPessoas()).isEmpty();
    }

    //verificacao
    @Test(expected = PessoaInexistenteException.class)
    public void naoDevePermitirRemoverPessoainexistente(){
        //cenario
        pessoa.setNome("Keblan");

        //execucao
        cadastroPessoas.remove(pessoa);
    }
}
