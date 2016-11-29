package br.nom.cruz.marcos.projetofinalandroiddev.model;

import java.io.Serializable;

/**
 * Created by marcospe on 11/22/2016.
 */

public class EnderecoTO implements Serializable {
    public static final String SELECT = "select * from endereco where idUser=";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS endereco(" +
            "idEndereco int not null primary key," +
            "logradouro nome VARCHAR(50)," +
            "numero nome VARCHAR(10)," +
            "cidade nome VARCHAR(50)," +
            "uf nome VARCHAR(2)" +
            ")";

    private int idEndereco;

    private String logradouro;

    private String numero;

    private String cidade;

    private String uf;

    private String complemento;

    private String pais;

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }
}
