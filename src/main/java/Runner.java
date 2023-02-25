import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {


        UserDao dao = new UserDao();
           dao.create(new User("glut","ja23en213","safepass"));
        // dao.delete(new User(17));
       // dao.update(18, new User("glut1", "ja23en1", "haslo1"));
        //  dao.findAll();
        //  dao.findById(8);


    }
}