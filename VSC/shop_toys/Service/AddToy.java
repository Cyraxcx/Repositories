package java.shop_toys.Service;

import Date.Toy;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddToy {


    List<Toy> toys = new ArrayList<>();


    public List<Toy> addToy()  {
        System.out.println("Сколько игрушек хотите добавить: ");
        Scanner counter = new Scanner(System.in);
        int count = counter.nextInt();
        int forCount = 0;
        while (forCount < count) {
            try(FileWriter writer = new FileWriter("Toys.txt", true)) {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите id ");
                int id = in.nextInt();
                writer.write(id + ";");

                Scanner in1 = new Scanner(System.in);
                System.out.println("Введите name ");
                String name = in1.nextLine();
                writer.write(name + ";");

                Scanner in2 = new Scanner(System.in);
                System.out.println("Введите количество ");
                int amount = in2.nextInt();
                writer.write(amount + ";");

                Scanner in3 = new Scanner(System.in);
                System.out.println("Введите частоту выпадания ");
                int frequency = in3.nextInt();
                writer.write(frequency + ";");

                Toy nextToy = new Toy(id, name, amount, frequency);
                toys.add(nextToy);
                writer.write("\n");
                forCount += 1;
            }
            catch (IOException ex) {

                    System.out.println(ex.getMessage());
                }
        }
        System.out.println("Добавленные игрушки:" + toys);
        return toys;

    }

}
