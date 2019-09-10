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
                        int side = getMeasurement(scanner, "side of the square");
                        AreaofSquare areaSq=new AreaofSquare(side);
                        System.out.println(areaSq.getArea());
                        break;
                    case "2":
                        int base = getMeasurement(scanner, "the base of the Triangle");
                        int height = getMeasurement(scanner, "the height of the Triangle");
                        AreaofTriangle areaTri=new AreaofTriangle(base,height);
                        System.out.println(areaTri.getArea());
                        break;
                    case "3":
                        int rad = getMeasurement(scanner, "the radius of the circle");
                        AreaofCircle areCircle= new AreaofCircle(rad);
                        System.out.println(areCircle.getArea());
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

    private static int getMeasurement(Scanner scanner, String msg) {
        System.out.printf("Enter ", msg);
        return Integer.parseInt(scanner.nextLine());
    }


}
