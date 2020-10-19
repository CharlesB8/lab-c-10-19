package fundamentals;

public class Main {
    // field is the term for class members/variables
    // this class can be stateful with static members
    public static int x = 7;

    //this field can't be accessed without encapsulation
    private int z = 3;


    public int getZ(){
        return z;
    }
    public static void myMethod(){
        //this is a local variable not a field
        //this belongs to the scope of myMethod()
        int y = 5;
    }

    // main method is considered the entrypoint
    // public is your access modifier
    // static means that it belongs to the class implementation/state
    // void is the return datatype

    public static void main(String[] args) {

        // this is instantiation
        // creates an instance, an instance is a snapshot of the object

        Main myMain = new Main();
        Main otherMain = new Main();
        System.out.println(myMain.x);
        System.out.println(otherMain.x);

        Walls northWall = new Walls("red", false);
        Walls southWall = new Walls("red", false);
        System.out.println(northWall.getAmountOfWalls());

    }

}
