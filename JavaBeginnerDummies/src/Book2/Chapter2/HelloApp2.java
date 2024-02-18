package Book2.Chapter2;

public class HelloApp2 {
    public static void main(String[] args) {
        //instance variables
        HelloApp h = new HelloApp(); //creating instance of HelloApp to use its instance variable
        h.helloMessage = "Hey";
        System.out.println(h.helloMessage);

        //static variables
        System.out.println(HelloApp.helloMessage2);// printing a class/static variable from HelloApp using it's class name in front.
        HelloApp.main(args); //running static/class method of Hello App
    }
}
