package sheena.zoo.com;
import java.util.Date;

    //Create a constructor that will accept all fields as arguments
    public class Animal {
        static int numOfAnimals = 0;
        private int age;
        private String sex;
        private double weight;
        private String animalID;
        private String animalName;
        private String animalBirthdate;
        private String animalColor;
        private String animalOrigin;
        private Date animalArrivalDate;
        private String animalSound;

        public Animal(String sex, int age, double weight, String animalName, String animalID,
                      String animalBirthdate, String animalColor, String animalOrigin) {
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.animalName = animalName;
            this.animalID = animalID;
            this.animalBirthdate = animalBirthdate;
            this.animalColor = animalColor;
            this.animalOrigin = animalOrigin;
            numOfAnimals++;
        }

        public Animal() {

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

