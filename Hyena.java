package sheena.zoo.com;

public class Hyena extends sheena.zoo.com.Animal {
    // Create a static int that keeps track of the number of hyenas created
    static int numOfHyenas = 0;

    // Create a constructor
    public Hyena() {
        numOfHyenas++;
    }

    // Constructor that accepts all attributes
    public Hyena(String animalID, int age, String animalName, String animalBirthdate,
                 String animalColor, String sex, int weight, String laugh,
                 String animalOrigin, String arrivalDate) {
        super(sex, age, weight, animalName, animalID, animalBirthdate, animalColor, animalOrigin);
    }


}


