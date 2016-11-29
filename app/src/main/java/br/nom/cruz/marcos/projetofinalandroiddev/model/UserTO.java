package br.nom.cruz.marcos.projetofinalandroiddev.model;

import java.io.Serializable;

/**
 * Created by marcospcruz on 19/11/16.
 */

public class UserTO implements Serializable {
    public static final String SELECT = "select * from user";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS user(idUser int not null primary key,nome VARCHAR(50)," +
            "password VARCHAR(50))";

    private int idUser;
    private String nome;

    private String password;
    private EnderecoTO endereco;
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEndereco(EnderecoTO endereco) {
        this.endereco = endereco;
    }

    public EnderecoTO getEndereco() {
        return endereco;
    }
}
