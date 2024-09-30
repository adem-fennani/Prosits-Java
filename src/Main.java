public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("Cats", "Simba", 10, true);
        Zoo myZoo = new Zoo("Belvedere", "Tunis");

        System.out.println(lion.toString());
        System.out.println(myZoo.displayZoo());

        myZoo.addAnimal(lion);
        System.out.println(myZoo.displayZoo());

        myZoo.removeAnimal(lion);
        System.out.println(myZoo.displayZoo());
    }
}