package unipi.kormazos;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) throws Exception {

        int code;
        int findcode;
        int age;
        final int[] v = new int[1];
        int h = 0;
        double species;
        double choice;
        double height;
        double weight;
        double food;
        double water;
        double feed;
        double feed2;
        String sex;
        String name;
        String removeanimal;
        String findanimal;

        File f = new File("listData");
        Scanner userInput = new Scanner(System.in);
        ArrayList<Animals> zoo = new ArrayList<>();
        Animals lion = new Animals(1, "Lion", "male", 10, 1.2, 300, 4, 6, 0);

        zoo.add(lion);

        System.out.println("Welcome to our Zoo !");
        do {
            System.out.println("*************************************************************************************");
            System.out.println("");
            System.out.println("In this section, you may complete the actions below:");
            System.out.println("1.View all the animals");
            System.out.println("2.Add a new animal");
            System.out.println("3.Search for an animal by name");
            System.out.println("4.Search for an animal by code");
            System.out.println("5 Delete an animal from the list");
            System.out.println("6.Feed an animal");
            System.out.println("7.Save");
            System.out.println("8.Load");
            System.out.println("9.Reset food quantity");
            System.out.println("0.Exit");
            System.out.println("What would you like to do?(Press a number from the Menu(0-8))");
            System.out.println(":");
            choice = userInput.nextDouble();

            if (choice == 1) {
                for (int i = 0; i < zoo.size(); i++) {
                    System.out.println(zoo.get(i).toString());
                }

            } else if (choice == 2) {

                System.out.println("Insert the new animal to our zoo:");
                code = zoo.size() + 2;
                System.out.println("Type the name:");
                name = userInput.next();
                System.out.println("Type the sex:");
                sex = userInput.next();
                System.out.println("Type the age:");
                age = userInput.nextInt();
                System.out.println("Type the height:");
                height = userInput.nextDouble();
                System.out.println("Type the weight:");
                weight = userInput.nextDouble();
                System.out.println("Type how many kilos of food this animal needs:");
                food = userInput.nextDouble();
                System.out.println("Type how many liters of water this animal needs:");
                water = userInput.nextDouble();

                System.out.println("Press 0 if you want to add an Reptilian or an Amphibian.");
                System.out.println("Press 1 if you want to add a Mammal.");
                System.out.println("Press 2 if you want to add a Bird.");
                System.out.println("Press 3 if you want to add a Fish.");
                species = userInput.nextInt();
                if (species == 0) {

                    Animals AnimAdd = new Animals(code, name, sex, age, height, weight, food, water, food);
                    zoo.add(AnimAdd);
                    System.out.println("Reptilians and Amphibians don't need any extra information.");

                } else if (species == 1) {

                    System.out.println("How many months of pregnancy this mammal has?");
                    h = userInput.nextInt();
                    Mammals Mammaladd = new Mammals(code, name, sex, age, height, weight, food, water, food, h);
                    zoo.add(Mammaladd);

                } else if (species == 2) {

                    System.out.println("How many meters high this Bird can fly?");
                    h = userInput.nextInt();
                    Birds Birdadd = new Birds(code, name, sex, age, height, weight, food, water, food, h);
                    zoo.add(Birdadd);

                } else if (species == 3) {

                    System.out.println("Which is the biggest depth that this fish can swim?");
                    h = userInput.nextInt();
                    Fishes Fishadd = new Fishes(code, name, sex, age, height, weight, food, water, food, h);
                    zoo.add(Fishadd);

                } else {

                    System.out.println("Wrong number");
                }
                System.out.println("The animal was added");

            } else if (choice == 3) {
                v[0] = 0;
                System.out.println("Write the name of the animal:");
                findanimal = userInput.next();

                //moiazei me thn for ths 37
                String finalFindanimal = findanimal;
                zoo.forEach(animal -> {
                    if (animal.getName().equals(finalFindanimal)) {
                        System.out.println(animal);
                        v[0] =1;
                    }
                });
                if (v[0] == 0) {
                    System.out.println("Animal not found.");
                }
            } else if (choice == 4) {
                v[0] = 0;
                System.out.println("Write the code of the animal:");
                findcode = userInput.nextInt();
                int finalFindcode = findcode;
                zoo.forEach(animal -> {
                    if (animal.getCode() == finalFindcode) {
                        System.out.println(animal);
                        v[0] = 1;
                    }
                });

                if (v[0] == 0) {
                    System.out.println("Animal not found.");
                }
            } else if (choice == 5) {

                v[0] = 0;
                System.out.println("Which animal would you like to delete?");
                System.out.println("Write the name:");
                removeanimal = userInput.next();
                for (int l = 0; l < zoo.size(); l++) {
                    if (zoo.get(l).getName().equals(removeanimal)) {
                        zoo.remove(zoo.get(l));
                        System.out.println(zoo.get(l).toString() + " " + "Animal removed");

                        break;
                    }
                    v[0]++;
                }
                if (v[0] == 0) {
                    System.out.println("Animal not found.");
                }

            } else if (choice == 6) {
                System.out.println("Write the code of the animal:");
                code = userInput.nextInt();
                code--;
                System.out.println("How much food did you give to the animal?");
                feed = userInput.nextDouble();
                feed2 = (zoo.get(code).getFood());
                if (feed > feed2) {
                    System.out.println("The quantity that was given is too much food!");
                    zoo.get(code).setFeeding(0);
                } else {

                    zoo.get(code).setFeeding(feed2 - feed);
                    System.out.println("The animal needs more food.");
                }

            } else if (choice == 7) {
                try {
                    FileOutputStream fos = new FileOutputStream(f);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(zoo);
                    oos.close();
                    fos.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
                System.out.println("Saved");
            } else if (choice == 8) {
                try {
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    zoo = (ArrayList) ois.readObject();
                    ois.close();
                    fis.close();

                } catch (IOException ioe) {

                    ioe.printStackTrace();
                    return;

                } catch (ClassNotFoundException c) {

                    System.out.println("Class not found");
                    c.printStackTrace();
                    return;

                }

                //Verify list data
                for (int i = 0; i < zoo.size(); i++) {

                    System.out.println(zoo.get(i).toString());
                }

            } else if (choice == 9) {

                for (int i = 0; i < zoo.size(); i++) {
                    zoo.get(i).setFeeding(zoo.get(i).getFood());
                }
                System.out.println("The quantity has been reset.");
            } else if (choice == 0) {

                System.out.println("Bye Bye");

            } else {

                System.out.println("Wrong choice.Please press a number from 0 - 8.");

            }
        } while (choice != 0);
    }
}
