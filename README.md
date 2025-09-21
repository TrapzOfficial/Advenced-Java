Advanced Java: Getting Started

Java is powerful and scalable. Once you know the basics, you can explore advanced topics for real-world applications.

1. Object-Oriented Programming (OOP) Concepts

Encapsulation – Keep data private, expose with getters/setters.

Inheritance – Reuse and extend existing classes.

Polymorphism – Methods behave differently based on input.

Abstraction – Hide complex implementation using abstract classes/interfaces.

Example: OOP with Inheritance

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

public class OOPExample {
    public static void main(String[] args) {
        Animal a = new Animal("Generic");
        a.sound();

        Dog d = new Dog("Buddy");
        d.sound();
    }
}

2. Exception Handling

Use try-catch blocks to handle errors gracefully.

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            scanner.close();
        }
    }
}

3. Collections Framework

Java Collections allow storing, searching, and managing data efficiently.

Common collections: ArrayList, HashMap, HashSet.

Example: ArrayList & HashMap

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");

        System.out.println("Users list:");
        for (String user : users) {
            System.out.println(user);
        }

        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);

        System.out.println("\nUser scores:");
        for (String user : scores.keySet()) {
            System.out.println(user + " - " + scores.get(user));
        }
    }
}

4. File Handling

Read and write files using File, FileReader, FileWriter.

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, Java File Handling!\n");
            writer.write("This is a second line.");
            writer.close();

            FileReader reader = new FileReader("example.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

5. Simple GUI with Swing

Create windows, buttons, and handle events.

import javax.swing.*;
import java.awt.event.*;

public class GUIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI Example");
        JButton button = new JButton("Click Me");

        button.setBounds(100, 100, 150, 50);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        frame.add(button);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

6. Advanced Exercises

Library System – Use classes, ArrayList, and file handling to manage books.

Banking App – OOP, collections, and exception handling to manage accounts.

Simple GUI Calculator – Swing GUI with buttons for arithmetic operations.

Login System – Store users in a HashMap and validate credentials.

Student Management – Use classes and arrays/collections to store, sort, and search students.

7. Resources to Practice

Java Official Documentation

HackerRank Java Challenges

LeetCode Java Problems

Java Swing Tutorials

Java Collections Framework Guide
