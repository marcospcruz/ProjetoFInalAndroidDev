package br.nom.cruz.marcos.projetofinalandroiddev.factory;

/**
 * Created by marcospcruz on 19/11/16.
 */

public class CommandFactory implements BaseFactory {

    public Object getObject(String objectName) throws Exception {

        Class clazz = Class.forName(objectName);
        Object object = clazz.newInstance();


        return object;

    }
}
