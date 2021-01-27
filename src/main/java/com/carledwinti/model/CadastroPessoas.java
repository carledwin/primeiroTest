package com.carledwinti.model;

import com.carledwinti.exception.PessoaInexistenteException;
import com.carledwinti.exception.PessoasNulaException;
import com.carledwinti.exception.PessoasSemNomeException;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    private List<Pessoa> pessoas;

    public CadastroPessoas(){
        pessoas = new ArrayList<>();
    }

    public List<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void adiciona(Pessoa pessoa) {
        if(pessoa == null){
            throw new PessoasNulaException();
        }
        if(pessoa.getNome() == null){
            throw new PessoasSemNomeException();
        }
        this.pessoas.add(pessoa);
    }

    public void remove(Pessoa pessoa) {
        if(!this.pessoas.contains(pessoa)){
            throw new PessoaInexistenteException();
        }
        this.pessoas.remove(pessoa);
    }
}
