package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    public static final int NUMBER_OF_CAGES = 25;
    private int numAnimals;

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNumAnimals() {
        return numAnimals;
    }

    public void setNumAnimals(int numAnimals) {
        this.numAnimals = numAnimals;
    }

    Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
        this.numAnimals = 0;
    }

    public String displayZoo() {
        return "Nom: " + name + ", Ville: " + city + ", Nombre de cages: " + NUMBER_OF_CAGES + ", Nombre d'animaux: " + numAnimals;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < NUMBER_OF_CAGES; i++) {
            if (animals[i] != null && animal.name.equals(animals[i].name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addAnimal(Animal animal) {
        if (animal.age < 0) {
            System.out.println("Le nom de l'animal ne doit pas être négatif");
            return false;
        } else if (!isZooFull()) {
            if (searchAnimal(animal) == -1) {
                animals[numAnimals] = animal;
                numAnimals++;
                return true;
            }
        }
        return false;
    }

    public boolean removeAnimal(Animal animal) {
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

    public boolean isZooFull() {
        return numAnimals == NUMBER_OF_CAGES;
    }

    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.numAnimals > z2.numAnimals) {
            return z1;
        } else {
            return z2;
        }
    }
}