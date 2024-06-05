package com.example.program3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        System.out.println("PROGRAM TO GENERATE THE FIBONACCI SERIES");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int NumberOfCases = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci series up to " + NumberOfCases + " cases: ");
        int a = 0;
        int b = 1;
        for (int i = 0; i < NumberOfCases; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
