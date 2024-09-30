public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    public static final int NBRCAGES = 25;
    public int numAnimals;

    Zoo(String name, String city) {
        animals = new Animal[NBRCAGES];
        this.name = name;
        this.city = city;
        this.numAnimals = 0;
    }

    public String displayZoo() {
        return "Nom: " + name + ", Ville: " + city + ", Nombre de cages: " + NBRCAGES + ", Nombre d'animaux: " + numAnimals;
    }

    int searchAnimal(Animal animal) {
        for (int i = 0; i < NBRCAGES; i++) {
            if (animals[i] != null && animal.name.equals(animals[i].name)) {
                return i;
            }
        }
        return -1;
    }

    boolean addAnimal(Animal animal) {
        if (numAnimals < NBRCAGES) {
            if (searchAnimal(animal) == -1) {
                animals[numAnimals] = animal;
                numAnimals++;
                return true;
            }
        }
        return false;
    }

    boolean removeAnimal(Animal animal) {
        int x = searchAnimal(animal);
        if (x != -1) {
            for (int i = x; i < numAnimals; i++) {
                animals[i] = animals[i + 1];
            }
            this.numAnimals--;
            return true;
        }
        return false;
    }

    boolean isZooFull() {
        if (numAnimals == NBRCAGES) {
            return true;
        } else {
            return false;
        }
    }

    Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.numAnimals > z2.numAnimals) {
            return z1;
        } else {
            return z2;
        }
    }
}