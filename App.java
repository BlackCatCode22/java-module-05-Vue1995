// sV 29Oct2024
// zooVersion01.java
//
package sheena.zoo.com;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {

    private static String calcAnimalBirthDate(int age, String theSeason) {
        Date today = new Date();
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");
        String strTodaysYear = formatterYear.format(today);

        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - age;

        String season = theSeason.toLowerCase();
        String animalBirthdate;

        switch (season) {
            case "spring":
                animalBirthdate = animalBirthYear + "-03-21";
                break;
            case "fall":
                animalBirthdate = animalBirthYear + "-09-21";
                break;
            case "winter":
                animalBirthdate = animalBirthYear + "-12-21";
                break;
            case "summer":
                animalBirthdate = animalBirthYear + "-06-21";
                break;
            default:
                animalBirthdate = animalBirthYear + "-01-01"; // Default case
                break;
        }

        return animalBirthdate;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to my Zoo Program!");

        // Update with the correct file path
        String animalNamesFilePath = "C:/Users/BE218/CIT 63/ZooMidterm2/animalNames.txt";
        AnimalNameListsWrapper animalLists =
                Utilities.createAnimalNameLists(animalNamesFilePath);

        // Display animal names
        displayAnimalNames("Hyena", animalLists.getHyenaNameList());
        displayAnimalNames("Lion", animalLists.getLionNameList());
        displayAnimalNames("Tiger", animalLists.getTigerNameList());
        displayAnimalNames("Bear", animalLists.getBearNameList());

        // Read arriving animals from file
        String arrivingAnimalsFilePath = "arrivingAnimals.txt";
        readArrivingAnimals(arrivingAnimalsFilePath);
    }

    private static void displayAnimalNames(String animalType, ArrayList<String> names) {
        System.out.println("\n" + animalType + " names:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    private static void readArrivingAnimals(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                processAnimalLine(line); // Process each line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processAnimalLine(String line) {
        String[] arrayOfStrPartsOnComma = line.split(", ");
        if (arrayOfStrPartsOnComma.length < 2) {
            System.out.println("Invalid line format: " + line);
            return;
        }

        String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(" ");
        String[] arrayOfStrPartsOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");

        if (arrayOfStrPartsOnSpace.length < 1 || arrayOfStrPartsOnSpace02.length < 3) {
            System.out.println("Invalid animal data: " + line);
            return;
        }

        String ageInYears = arrayOfStrPartsOnSpace[0];
        String animalBirthSeason = arrayOfStrPartsOnSpace02[2];


        Hyena Hyena1 = new Hyena("Hy01", 4, "Zig", "2020-03-21", "tan", "female", 70, "haha", "Friguia Park, Tunisia", "2024-04-07");

        // Output the animal's fields
        System.out.println("\nThis is the new animal!");
        System.out.println("ID: " + Hyena1.getAnimalID());
        System.out.println("Name: " + Hyena1.getAnimalName());
        System.out.println("Age: " + Hyena1.getAge());
        System.out.println("Sex: " + Hyena1.getSex());
        System.out.println("Weight: " + Hyena1.getWeight());
        System.out.println("Birthdate: " + Hyena1.getAnimalBirthdate());
        System.out.println("Color: " + Hyena1.getAnimalColor());
        System.out.println("Origin: " + Hyena1.getAnimalOrigin());
        System.out.println("Arrival Date: " + Hyena1.getAnimalArrivalDate());

        Hyena Hyena2 = new Hyena("Hy02", 11, "Bud", "2012-09-21", "brown", "male", 150, "hehe", "Friguia Park, Tunisia", "2024-04-07");

        // Output the animal's fields
        System.out.println("\nThis is the new animal!");
        System.out.println("ID: " + Hyena2.getAnimalID());
        System.out.println("Name: " + Hyena2.getAnimalName());
        System.out.println("Age: " + Hyena2.getAge());
        System.out.println("Sex: " + Hyena2.getSex());
        System.out.println("Weight: " + Hyena2.getWeight());
        System.out.println("Birthdate: " + Hyena2.getAnimalBirthdate());
        System.out.println("Color: " + Hyena2.getAnimalColor());
        System.out.println("Origin: " + Hyena2.getAnimalOrigin());
        System.out.println("Arrival Date: " + Hyena2.getAnimalArrivalDate());
    }
}