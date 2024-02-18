package Book2.Chapter2;

public class ShadowApp {
    public static int x;

    public static void main(String[] args) {
        //class variable
        x=10;
        System.out.println("x =  "+ x);

        //shadow inst variable
        int x;
        x=11;
        System.out.println(" x =  "+ x);
        System.out.println("ShadowApp.x =  "+ ShadowApp.x);
    }

}
