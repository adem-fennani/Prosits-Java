public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    public int NBRCAGES = 25;

    Zoo(String name, String city) {
        animals = new Animal[NBRCAGES];
        this.name = name;
        this.city = city;
    }

    public String displayZoo() {
        return "Nom: " + name + ", Ville: " + city + ", Nombre de cages: " + NBRCAGES;
    }
}