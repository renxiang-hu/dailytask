package classLoader;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(Test1.class.getClassLoader());
        System.out.println(Test1.class.getClassLoader().getParent());
        System.out.println(Test1.class.getClassLoader().getParent().getParent());
    }
}
