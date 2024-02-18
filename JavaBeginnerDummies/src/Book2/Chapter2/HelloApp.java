package Book2.Chapter2;

public class HelloApp {
    public String helloMessage; // ins var

    public static String helloMessage2; //class var -- static is used

    public static void main(String[] args) {
        HelloApp ha = new HelloApp(); //creating an instance of a class to use its instance variable.
        ha.helloMessage = "hello there";
        System.out.println(ha.helloMessage); // using class variable without creating an instance

        helloMessage2 = "hello google";
        System.out.println(helloMessage2);
    }
}
