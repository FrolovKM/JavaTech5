package com.epam.konstantin_frolov.java.lesson2;

import com.epam.konstantin_frolov.java.lesson2.models.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        Kitchen kitchen = new Kitchen(100, 7, Kitchen.TypeKitchen.Owen);
        ComputerAndTV computerAndTV = new ComputerAndTV(200, 25, ComputerAndTV.TypeComputerAndTV.TV);
        SmallTech smallTech = new SmallTech(350, 2, SmallTech.TypeSmallTech.Iron);

        ElSystem elsystem = new ElSystem();

        int i = 0;
        elsystem.add(kitchen);
        elsystem.add(computerAndTV);
        elsystem.add(computerAndTV);
        elsystem.add(computerAndTV);
        elsystem.add(smallTech);


        System.out.println("Electric System Power: ");
        System.out.println(elsystem.getElSystemPower());
        System.out.println();

        System.out.println("Sort something by weight:");
        elsystem.sort();
        this.printSomething(elsystem.getSomething());

        System.out.println("Find something by weight from 0 to 15:");
        this.printSomething(elsystem.findSomethingByWeight(0, 15));
    }

    private void printSomething(List<Something> something) {
        something.forEach(this::printSomething);
        System.out.println();
    }

    private void printSomething(Something something) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(something.toString()).append("\n")
                .append("Power: ").append(something.getPower()).append("\n")
                .append("Weight: ").append(something.getWeight());
        System.out.println(stringBuilder);
    }
}