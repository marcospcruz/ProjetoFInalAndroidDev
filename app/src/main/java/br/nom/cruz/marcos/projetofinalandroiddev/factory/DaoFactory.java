package br.nom.cruz.marcos.projetofinalandroiddev.factory;


import android.support.v7.app.AppCompatActivity;

import br.nom.cruz.marcos.projetofinalandroiddev.dao.DaoBase;

/**
 * Created by marcospcruz on 20/11/16.
 */

public class DaoFactory extends CommandFactory {

    public DaoBase getObject(String objectName, AppCompatActivity activity) throws Exception {
        Object object = super.getObject(objectName);
        Class clazz = object.getClass();
        clazz.getDeclaredMethod("setActivityObject", new Class[]{AppCompatActivity.class})
                .invoke(object, activity);
        return (DaoBase) object;
    }
}
