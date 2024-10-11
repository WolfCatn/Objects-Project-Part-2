//Created my Naomi Johnson
//for CTE Software Development Class 2024
//Instructor: Kim Gross

public class Marble {
    private String color;
    private int count; // Number of marbles in the set

    public Marble(String color, int initialCount) {
        this.color = color;
        this.count = initialCount;
    }

    public void print() {
        System.out.println("Marble set (" + color + ") contains " + count + " marbles.");
    }

    public void takeaway(int amount) {
        //Using an if, else statement to print out how many marbles are being taken from the marble set.
        if (amount <= count) {
            count -= amount;
            System.out.println(amount + " marbles removed from the " + color + " set.");
            //If there are not enough marbles to take away, if states that.
        } else {
            System.out.println("Not enough marbles in the " + color + " set.");
        }
    }

    public int getNumber() {
        return count;
    }

    public static void main(String[] args) {
        //Setting up the blueMarble set.
        Marble blueMarble = new Marble("Blue", 12);
        blueMarble.print();
        //Have 6 marbles taken out of the set
        blueMarble.takeaway(6);
        System.out.println("Remaining blue marbles: " + blueMarble.getNumber());

        //Setting up the redMarble set.
        Marble redMarble = new Marble("Red", 15);
        redMarble.print();
        //Have 9 marbles taken from the set
        redMarble.takeaway(9);
        System.out.println("Remaining red marbles: " + redMarble.getNumber());

        //Setting up the greenMarble set.
        Marble greenMarble = new Marble("Green", 10);
        greenMarble.print();
        // Trying to remove more than available
        greenMarble.takeaway(12); 
        greenMarble.print();
    }
}