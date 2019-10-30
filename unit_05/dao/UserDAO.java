package dao;

import beans.AutorisationInfo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserDAO {

    private String authPath = "resources/...";

    public boolean signIn(AutorisationInfo authInfo) throws DAOException {
        try (BufferedReader fileNoteReader = new BufferedReader(new FileReader(authPath))) {
            String s = fileNoteReader.readLine();
            String[] info = s.split(" ");
            AutorisationInfo infoAuth = new AutorisationInfo(info[0], info[1]);
            if (authInfo.equals(infoAuth)) {
                return true;
            }
            return false;
        } catch (FileNotFoundException e) {
            throw new DAOException(e.getMessage());
        } catch (IOException e) {
            throw new DAOException(e.getMessage());
        }
    }
}
