package sheena.zoo.com;

public class Bear extends sheena.zoo.com.Animal {

    // Create a static int that keeps track of the number of hyenas created
    static int numOfBears = 0;

    // Create a constructor
    public Bear(String someName) {
        super();
        numOfBears++;
    }
}