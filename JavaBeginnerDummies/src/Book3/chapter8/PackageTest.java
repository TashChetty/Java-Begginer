package Book3.chapter8;

import com.gmail.markdrinkwater.util.Console;
import java.io.*;
import java.awt.*;
import javafx.controls;
import javafx.fxml;

public class PackageTest {
    public static void main(String[] args) {
        while (Console.askYorN("Keep going?")) {
            System.out.println("D'oh!");
        }
    }
}
