import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        System.out.println("Copy HashSet: " + nomiPersone());

    }
    private static HashSet<String> nomiPersone() {
        HashSet<String> persone = new HashSet<>();
        HashSet<String> persone2 = new HashSet<>();
        persone.add("Andrea");
        persone.add("Giuseppe");
        persone.add("Daniele");
        persone.add("Francesco");
        persone2.add("Laura");
        persone2.add("Francesca");
        persone2.add("Elena");
        persone.addAll(persone2);
        return persone;

    }

}
