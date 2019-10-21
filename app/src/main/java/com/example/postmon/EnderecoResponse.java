package com.example.postmon;

import java.util.List;

class EnderecoResponse {

    private List<Endereco> endereco;

    public EnderecoResponse(List<Endereco>endereco){
        this.endereco = endereco;
    }
    public List<Endereco> getEndereco(){
        return endereco;
    }
    public void setEndereco(List<Endereco>endereco){
        this.endereco = endereco;
    }
}
