package sheena.zoo.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utilities {
    public static AnimalNameListsWrapper createAnimalNameLists(String filePath) {
        ArrayList<String> hyenaNameList = new ArrayList<>();
        ArrayList<String> lionNameList = new ArrayList<>();
        ArrayList<String> tigerNameList = new ArrayList<>();
        ArrayList<String> bearNameList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            ArrayList<String> currentList = null;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.equals("Hyena Names:")) {
                    currentList = hyenaNameList;
                } else if (line.equals("Lion Names:")) {
                    currentList = lionNameList;
                } else if (line.equals("Tiger Names:")) {
                    currentList = tigerNameList;
                } else if (line.equals("Bear Names:")) {
                    currentList = bearNameList;
                } else if (!line.isEmpty() && currentList != null) {
                    String[] names = line.split(",\\s*");
                    for (String name : names) {
                        currentList.add(name);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        return new AnimalNameListsWrapper(hyenaNameList, lionNameList, tigerNameList, bearNameList);
    }
}