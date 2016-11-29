package br.nom.cruz.marcos.projetofinalandroiddev.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;

import br.nom.cruz.marcos.projetofinalandroiddev.builder.UserBuilder;
import br.nom.cruz.marcos.projetofinalandroiddev.model.UserTO;

/**
 * Created by marcospcruz on 19/11/16.
 */

public class UserDao extends DaoBase{


    @Override
    public void salva(Object object) {

        UserTO user= (UserTO) object;
        String sql="insert into user(nome,password) values('"+user.getNome()+"','"+user.getPassword()+"')";
        runSql(sql);

    }

    @Override
    public UserTO select() {
        UserBuilder userBuilder=new UserBuilder();

        try {
            Cursor cursor = executeQuery(UserTO.SELECT);
            if(cursor.getCount()>0){
                cursor.moveToFirst();
                userBuilder.criaUser().setNome(cursor.getString(0)).setPassword(cursor.getString(1));
            }
        }catch(SQLiteException e){
            e.printStackTrace();
            if(e.getMessage().contains("no such table")){
                createTable("user");
            }
        }

        return userBuilder.getUser();
    }

    protected void createTable(String tableName){
        super.runSql(UserTO.CREATE_TABLE);
    }

    public void setActivityObject(AppCompatActivity activityObject){
        super.setActivityObject(activityObject);
    }
}
