package services;

import beans.AutorisationInfo;
import dao.DAOException;
import dao.DAOFactory;
import dao.UserDAO;

public class UserService {
    public boolean signIn(AutorisationInfo authInfo) throws ServiceException {
        if (authInfo.getLogin() == null || authInfo.getLogin().isEmpty()) {
            throw new ServiceException("Incorrect login");
        }
        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoFactory.getUserDAO();
            if (userDAO.signIn(authInfo)) {
                return true;
            }
            return false;
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }
    }

}
