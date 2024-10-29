package sheena.zoo.com;

public class Tiger extends sheena.zoo.com.Animal {

    // Create a static int that keeps track of the number of hyenas created
    static int numOfTigers = 0;

    // Create a constructor
    public Tiger(String someName) {
        numOfTigers++;
    }
}