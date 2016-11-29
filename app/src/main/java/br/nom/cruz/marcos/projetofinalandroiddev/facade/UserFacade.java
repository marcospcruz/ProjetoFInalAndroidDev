package br.nom.cruz.marcos.projetofinalandroiddev.facade;

import br.nom.cruz.marcos.projetofinalandroiddev.MainActivity;
import br.nom.cruz.marcos.projetofinalandroiddev.dao.UserDao;
import br.nom.cruz.marcos.projetofinalandroiddev.enumeration.ConstantsEnum;
import br.nom.cruz.marcos.projetofinalandroiddev.factory.DaoFactory;
import br.nom.cruz.marcos.projetofinalandroiddev.model.UserTO;

/**
 * Created by marcospcruz on 20/11/16.
 */
public class UserFacade {
    private DaoFactory daoFactory;
    private MainActivity activity;
    public UserFacade(MainActivity activity){
        daoFactory=new DaoFactory();
        this.activity=activity;
    }
    public void salvaUsuario(UserTO user) throws Exception {
        UserDao userDao= (UserDao) daoFactory.getObject(ConstantsEnum.USER_DAO.getName(),activity);
        userDao.salva(user);
    }
}
