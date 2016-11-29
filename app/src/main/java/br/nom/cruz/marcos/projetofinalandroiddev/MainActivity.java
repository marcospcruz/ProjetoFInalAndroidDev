package br.nom.cruz.marcos.projetofinalandroiddev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.nom.cruz.marcos.projetofinalandroiddev.dao.UserDao;
import br.nom.cruz.marcos.projetofinalandroiddev.enumeration.ConstantsEnum;
import br.nom.cruz.marcos.projetofinalandroiddev.factory.DaoFactory;
import br.nom.cruz.marcos.projetofinalandroiddev.model.UserTO;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private UserTO user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkLoggedUser();

    }

    private void showToastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    /**
     *
     */
    private void checkLoggedUser() {
        UserDao userDao = null;
        DaoFactory factory=new DaoFactory();
        try {
            userDao = (UserDao) factory.getObject(ConstantsEnum.USER_DAO.getName(), this);
            user = userDao.select();
//            if (user == null)  COMENTADO PARA TESTAR LOGIN
                inflateLoginFragment();
//
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private void inflateLoginFragment() throws Exception{
//        Util.changeFragment(getSupportFragmentManager(),ConstantsEnum.FRAGMENT_LOGIN.getName());
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainActivityContainer,new FragmentLogin())
                .addToBackStack(null)
                .commit();
    }


    private void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View view) {
        System.out.println();
    }
}
