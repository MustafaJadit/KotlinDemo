import com.tamam.User;
import com.tamam.User3;


public class JavaDemo {
    public static void main(String[] args) {
        System.out.println("test");
        com.tamam.KotlinFromJavaKt.getTime();
        User user = new User("12");
        String id = user.getID();
        int id1 = User3.Companion.getID();
        String myName = User3.myName;
        String myStatic = User3.getMyStatic();
    }
}
