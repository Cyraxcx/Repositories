package java.shop_toys.Service;

import java.io.*;
import java.util.Scanner;

public class Game {

    public void showToy(){
        try(FileReader reader = new FileReader("Toys.txt"))
        {

            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    public void showGame(){
        try {
            File file = new File("Toys.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            Scanner choise = new Scanner(System.in);
            System.out.println("Введите номер до 8: ");
            int forChoise = choise.nextInt();
            int count = 1;
            while (line != null) {
                if (forChoise == count) {
                    System.out.println("Ваша игрушка: ");
                    System.out.println(line);
                    // считываем остальные строки в цикле

                }
                line = reader.readLine();
                count ++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
