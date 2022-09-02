import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {

        extracted2();
    }

    private static void extracted2() {
        Demo2 demo2 = new Demo2();
        ArrayList<Son> sons = new ArrayList<>();
        sons.add(new Son("mustafa"));
        sons.add(new Son("osman"));
        sons.add(new Son("gopur"));
        sons.add(new GrandSon("Deniz"));
        demo2.setNames(sons);
    }

    void setNames(List<? super Son> list) {
        list.add(new Son("Orhan"));
//        list.add(new Father());
        list.set(2, new Son("yusuf"));
        for (Object son :
                list) {
            if (son instanceof Son) {
                ((Son) son).handsome();
            }
        }

    }

    private static void extracted() {
        Demo2 demo2 = new Demo2();
        ArrayList<Son> sons = new ArrayList<>();
        sons.add(new Son("mustafa"));
        sons.add(new Son("osman"));
        sons.add(new Son("yusuf"));
        sons.add(new GrandSon("Deniz"));
        demo2.getNames(sons);
    }

    void getNames(List<? extends Father> list) {


        for (Father item :
                list) {
            System.out.println(item.name);
            if (item instanceof Son) {
                System.out.println(item + " is son");
//                list.set(list.indexOf(item), new Son("Dolan"));
                ((Son) item).handsome();
            } else if (item instanceof Daughter) {
                System.out.println(item + " is daughter");
                ((Daughter) item).beautiful();
            }
        }
        System.out.println("new list");
        list.forEach(System.out::println);
    }

    static class Father {
        String name = "father";
    }


    static class Son extends Father {

        @Override
        public String toString() {
            return "Son{" +
                    "name='" + name + '\'' +
                    '}';
        }

        String name = "son";

        public Son(String name) {
            this.name = name;
        }

        void handsome() {
            System.out.println(name + " is handsome");
        }
    }

    static class GrandSon extends Son {

        String name;

        public GrandSon(String name) {
            super(name);
            this.name = name;
        }

        @Override
        void handsome() {
            System.out.println("pretty decent and handsome");
        }
    }

    static class Daughter extends Father {
        String name = "daughter";

        @Override
        public String toString() {
            return "Daughter{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public Daughter(String name) {
            this.name = name;
        }

        void beautiful() {
            System.out.println("beautiful");
        }
    }
}
