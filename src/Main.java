import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ZooManagement z = new ZooManagement();
        Scanner s = new Scanner(System.in);

        System.out.println("Entrez le nom du zoo: ");
        z.zooName = s.next();

        System.out.println("Entrez le nombre des cages: ");
        z.nbreCages = s.nextInt();

        System.out.println(z.zooName + " se compose de " + z.nbreCages);
    }
}