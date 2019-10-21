package com.example.postmon;

public class Endereco {

    private String bairro;
    private String cidade;
    private String logradouro;
    private String estado_info;
    private String area_km2;
    private int codigo_ibge;
    private String nome;
    private int cep;
    private String cidade_info;

    public Endereco(String bairro, String cidade, String logradouro, String estado_info, String area_km2,
                    int codigo_ibge, String nome, int cep, String cidade_info){
        this.bairro = bairro;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.estado_info = estado_info;
        this.area_km2 = area_km2;
        this.codigo_ibge = codigo_ibge;
        this.nome = nome;
        this.cep = cep;
        this.cidade_info = cidade_info;

    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getEstado_info() {
        return estado_info;
    }

    public void setEstado_info(String estado_info) {
        this.estado_info = estado_info;
    }

    public String getArea_km2() {
        return area_km2;
    }

    public void setArea_km2(String area_km2) {
        this.area_km2 = area_km2;
    }

    public int getCodigo_ibge() {
        return codigo_ibge;
    }

    public void setCodigo_ibge(int codigo_ibge) {
        this.codigo_ibge = codigo_ibge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade_info() {
        return cidade_info;
    }

    public void setCidade_info(String cidade_info) {
        this.cidade_info = cidade_info;
    }
}
