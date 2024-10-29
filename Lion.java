package sheena.zoo.com;

public class Lion extends sheena.zoo.com.Animal {

    // Create a static int that keeps track of the number of hyenas created
    static int numOfLions = 0;

    // Create a constructor
    public Lion(String someName) {
        numOfLions++;
    }
}