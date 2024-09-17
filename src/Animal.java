public class Animal {
    public String family;
    public String name;
    public int age;
    public boolean isMammal;

    Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String toString() {
        return "Family: " + family + ", Name: " + name + ", Is mammal: " + isMammal;
    }
}
