package br.nom.cruz.marcos.projetofinalandroiddev.dao;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;

import android.database.Cursor;

import br.nom.cruz.marcos.projetofinalandroiddev.model.UserTO;

/**
 * Created by marcospcruz on 19/11/16.
 */
public abstract class DaoBase {

    private static final String DATABASE_NAME = "projetofinalandroiddev";

    private SQLiteDatabase dataBase;
    private AppCompatActivity activityObject;

    public DaoBase() {



    }

    protected void runSql(String sql){
        dataBase.execSQL(sql);
    }
    protected abstract void createTable(String table);

    private void openDatabase() {
//        dataBase= SQLiteDatabase.openDatabase(DATABASE_NAME, null,Context.MODE_ENABLE_WRITE_AHEAD_LOGGING);
//        dataBase = SQLiteDatabase.openOrCreateDatabase(DATABASE_NAME, null);
        dataBase=activityObject.openOrCreateDatabase(DATABASE_NAME, Context.MODE_PRIVATE,null);
    }


    protected Cursor executeQuery(String select) {
        return dataBase.rawQuery(select,null);
    }


    protected void setActivityObject(AppCompatActivity activityObject){
        this.activityObject=activityObject;
        openDatabase();
    }

    public abstract Object select();

    public abstract void salva(Object object);
}
