package com.company;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        do {

          System.out.println("enter your choice:\n" +
                  "1-To Calculate are of a Square\n" +
                  "2-To calculate Area of a Triangle\n" +
                  "3- To calculate Area of a circle\n");
          String choice = scanner.nextLine();
            try {
                switch (choice) {
                    case "1":
                        System.out.println("enter the length of each side");
                        int side = Integer.parseInt(scanner.nextLine());
                        double areaSq = side * side;
                        System.out.println(areaSq);
                        break;
                    case "2":
                        System.out.println("enter the Base of the triangle");
                        int base = Integer.parseInt(scanner.nextLine());
                        System.out.println("enter the height of the triangle");
                        int height = Integer.parseInt(scanner.nextLine());
                        double bandh = (base * height);
                        double areaTri = (bandh / 2);
                        System.out.println(areaTri);
                        break;
                    case "3":
                        System.out.println("Enter the radius of the circle");
                        int rad = Integer.parseInt(scanner.nextLine());
                        double areaCir = (Math.PI * (rad * rad));
                        System.out.printf("are of the circle is %2f", areaCir);
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("invalid");
            }
            System.out.println("do you wish to exit -X, else press any other key to continue ");
            String exit=scanner.nextLine();
            if(exit.equalsIgnoreCase("X")){
                System.out.println("bye");
                System.exit(0);
            }
        } while (true);

    }
}
