package Validator;

import model.User;
import DAO.UserDao;

public class RegistrationValidator implements Validator {
    @Override
    public boolean validation(User user) {


        if      (user.getFirstname().length()<20
                && user.getLastname().length()<20
                && user.getUsername().length()<10
                && user.getPassword().length()<16
                &&user.getFirstname().length()>1
                && user.getLastname().length()>1
                && user.getUsername().length()>1
                && user.getPassword().length()>1) {
            UserDao UserDAO = new UserDao();
            try {
                UserDAO.registerUser(user);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }else{

            return false;
        }
        return true;
        }

    }

