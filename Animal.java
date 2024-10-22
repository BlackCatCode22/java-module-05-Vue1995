package sheena.zoo.com;
import java.util.Date;

public class Animal {
    // Create a static int that keeps track of the number of animals created.
    static int numOfAnimals = 0;

    // Create a constructor for our new Animal objects
    public Animal(){
        numOfAnimals++;
    }

    //Create a constructor that will accept all fields as arguments
    public Animal(String animalID, int age, String animalName, String animalBirthdate, String animalColor,
                  double weight, String animalSound, String animalOrigin, Date animalArrivalDate) {
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalBirthdate = animalBirthdate;
        this.animalColor = animalColor;
        this.animalOrigin = animalOrigin;
        this.animalSound = animalSound;
    }


    //Create a all attributes (fields) needed for midterm
    // Age will be in years
    private int age;
    // Sex (male or female)
    private String sex;
    // Weight will be in pounds
    private double weight;
    // Animal ID
    private String animalID;
    // Animal names
    private String animalName;
    // Animal birthdate is going to be a string here (in this class)
    private String animalBirthdate;
    // Animal color
    private String animalColor;
    // Animal origin will be a string like: "from Friguia Park, Tunisia"
    private String animalOrigin;
    // Arrival date
    private Date animalArrivalDate;
    // Animal sound
    private String animalSound;

    public Animal(String sex, int age, int weight, String animalName, String animalID, String animalBirthdate, String animalColor, String animalOrigin) {
    }


    // Create getters and setters

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalID() {
        return animalID;
    }
    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalBirthdate() {
        return animalBirthdate;
    }
    public void setAnimalBirthdate(Date animalBirthdate) {
        this.animalBirthdate = String.valueOf(animalBirthdate);
    }

    public String getAnimalColor() {
        return animalColor;
    }
    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public String getAnimalOrigin() {
        return animalOrigin;
    }
    public void setAnimalOrigin(String animalOrigin) {
        this.animalOrigin = animalOrigin;
    }

    public Date getAnimalArrivalDate() {
        return animalArrivalDate;
    }
    public void setAnimalArrivalDate(Date animalArrivalDate) {
        this.animalArrivalDate = animalArrivalDate;
    }

}