package br.nom.cruz.marcos.projetofinalandroiddev.builder;

import br.nom.cruz.marcos.projetofinalandroiddev.model.EnderecoTO;
import br.nom.cruz.marcos.projetofinalandroiddev.model.UserTO;

/**
 * Created by marcospcruz on 20/11/16.
 */
public class UserBuilder {
    private UserTO user;

    /**
     *
     * @return
     */
    public UserBuilder criaUser() {
        if(user==null){
            user=new UserTO();
        }
        return this;
    }

    /**
     *
     * @param nome
     * @return
     */
    public UserBuilder setNome(String nome) {
        user.setNome(nome);
        return this;
    }

    /**
     *
     * @param password
     * @return
     */
    public UserBuilder setPassword(String password) {
        user.setPassword(password);
        return this;

    }

    public UserTO getUser() {
        return user;
    }


    public UserBuilder criaEndereco() {
        user.setEndereco(new EnderecoTO());
        return this;
    }

    public UserBuilder setLogradouro(String logradouro){

        user.getEndereco().setLogradouro(logradouro);
        return this;
    }
    public UserBuilder setNumero(String numero){
        user.getEndereco().setNumero(numero);
        return this;
    }

    public UserBuilder setComplemento(String complemento){
        user.getEndereco().setComplemento(complemento);
        return this;
    }

    public UserBuilder setCidade(String cidade){
        user.getEndereco().setCidade(cidade);
        return this;
    }

    public UserBuilder setUf(String uf){
        user.getEndereco().setUf(uf);
        return this;
    }

    public UserBuilder setPais(String pais){
        user.getEndereco().setPais(pais);
        return this;
    }
}
