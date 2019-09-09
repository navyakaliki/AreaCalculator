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
                        int side = getSide(scanner);
                        AreaofSquare areaSq=new AreaofSquare(side);
                        System.out.println(areaSq.getArea());
                        break;
                    case "2":
                        int base = getBase(scanner);
                        int height = getHeight(scanner);
                        AreaofTriangle areaTri=new AreaofTriangle(base,height);
                        System.out.println(areaTri.getAreatri());
                        break;
                    case "3":
                        int rad = getRad(scanner);
                        AreaofCircle areCircle= new AreaofCircle(rad);
                        System.out.println(areCircle.getAreaofCircle());
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

    private static int getRad(Scanner scanner) {
        System.out.println("Enter the radius of the circle");
        return Integer.parseInt(scanner.nextLine());
    }

    private static int getHeight(Scanner scanner) {
        System.out.println("enter the height of the triangle");
        return Integer.parseInt(scanner.nextLine());
    }

    private static int getBase(Scanner scanner) {
        System.out.println("enter the Base of the triangle");
        return Integer.parseInt(scanner.nextLine());
    }

    private static int getSide(Scanner scanner) {
        System.out.println("enter the side of the square");
        return Integer.parseInt(scanner.nextLine());
    }

}
