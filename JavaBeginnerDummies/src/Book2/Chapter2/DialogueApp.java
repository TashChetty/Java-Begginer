package Book2.Chapter2;
import javax.swing.*;
public class DialogueApp {
    public static void main(String[] args) {
        String s;
        s=JOptionPane.showInputDialog("Enter an integer:");
        int x = Integer.parseInt(s);
        System.out.println("You entered " + x + ". ");
    }
}
