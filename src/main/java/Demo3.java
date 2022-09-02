import java.util.HashMap;
import java.util.Hashtable;

public class Demo3 {
    public static void main(String[] args) {
        try {
            extracted();

        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }

    private static void extracted2() {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put(null,null);
    }

    private static void extracted() {
        Hashtable<String, String> stringStringHashtable = new Hashtable<>();
        stringStringHashtable.put(null, null);
//        System.out.println(stringStringHashtable.size());//java.lang.NullPointerException
    }

}
