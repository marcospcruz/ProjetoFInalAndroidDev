package br.nom.cruz.marcos.projetofinalandroiddev.enumeration;

/**
 * Created by marcospcruz on 19/11/16.
 */

public enum ConstantsEnum {


    USER_DAO(0), FRAGMENT_LOGIN(1), FRAGMENT_CRIA_PERFIL(2);

    private static final String PACKAGE = "br.nom.cruz.marcos.projetofinalandroiddev.";

    private static final String[] DAO_NAMES = {

            PACKAGE + "dao.UserDao",//0
            PACKAGE + "FragmentLogin",//1
            PACKAGE + "FragmentCriaPerfil"//2
    };

    private int index;

    ConstantsEnum(int index) {
        this.index = index;
    }

    public String getName() {
        return DAO_NAMES[index];
    }
}
