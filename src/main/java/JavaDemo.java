import com.tamam.kotlin_java_mutual_conversion.*;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

import java.util.Collection;


public class JavaDemo {
    public static void main(String[] args) {

        try {
            KotlinFromJava5Kt.writeToFile();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void extracted3() {
        Circle circle = new Circle(11, 22, 33);
        Circle circle2 = new Circle(21, 52);
        circle.draw("label1");
        circle.draw("label2", 21);
    }

    private static void extracted2() {
        User user = new User("12");
        KClass<KotlinFromJavaKt> kotlinClass = JvmClassMappingKt.getKotlinClass(KotlinFromJavaKt.class);
        Collection<KFunction<KotlinFromJavaKt>> constructors = kotlinClass.getConstructors();
        Collection<KCallable<?>> members = kotlinClass.getMembers();
        System.out.println(members.getClass());
        members.forEach(System.out::println);
        System.out.println(kotlinClass.getSimpleName());

    }

    private static void extracted() {
        System.out.println("test");
        KotlinFromJavaKt.getTime();
        User user = new User("12");
        String id = user.getID();
        int id1 = User3.Companion.getID();
        String myName = User3.myName;
        String myStatic = User3.getMyStatic();

        MyObj.callStatic();
        MyObj.INSTANCE.callNonStatic();
        MyObj.INSTANCE.callStatic();
    }
}
