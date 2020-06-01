import org.w3c.dom.ls.LSOutput;

public class Company {

    static void service() {
        System.out.println("repairs")
        ;
    }

    static void sell() {
        System.out.println("discounts");
        service();
    }

    static void clean() {
        System.out.println("cleanness");
    }

    public static void main(String[] args) {
        System.out.println("best company");
        System.out.println("career");
        sell();
        clean();
    }
}
