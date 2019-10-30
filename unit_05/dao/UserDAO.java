package dao;

import beans.AutorisationInfo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class UserDAO {

    private String authPath = "resources/...";

    public boolean signIn(AutorisationInfo authInfo) throws DAOException {
        try (InfoReader fileNoteReader = new InfoReader(authPath)) {
            String s = fileNoteReader.readNote();
            String[] info = s.split(" ");

            AutorisationInfo infoFromFile = new AutorisationInfo(info[0], info[1]);

            if (authInfo.equals(infoFromFile)) {
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
