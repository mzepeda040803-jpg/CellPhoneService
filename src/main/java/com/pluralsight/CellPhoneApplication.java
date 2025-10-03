package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();
        dial();

        //cellPhone should match the class name from list of getters/setters

        cellPhone1.setSerialNumber("12345 - 67890");
        cellPhone1.setModel("iphone 14");
        cellPhone1.setCarrier("Verizon");
        cellPhone1.setPhoneNumber("111-111-1111");
        cellPhone1.setOwner("Dana Wyatt");
        cellPhone1.display();


        System.out.println("What is the serial number?");
        System.out.println(cellPhone1.getSerialNumber());
        //String serialNumber = myScanner.nextLine();


        System.out.println("What model is the phone?");
        System.out.println(cellPhone1.getModel());
        //String model = myScanner.nextLine();


        System.out.println("Who is the carrier?");
        System.out.println(cellPhone1.getCarrier());
        //String carrier = myScanner.nextLine();


        System.out.println("What is the phone number?");
        System.out.println(cellPhone1.getPhoneNumber());
        //String phoneNumber = myScanner.nextLine();


        System.out.println("Who is the owner of the phone?");
        System.out.println(cellPhone1.getOwner());
        //String owner = myScanner.nextLine();

        //System.out.println();


    }

    private static void dial() {
        Scanner myScanner = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();
        dial();





    }


    // serialNumber (ex: 1000000 - 9999999)
// model (ex: iPhone X)
 //carrier (ex: AT&T)
 //phoneNumber (ex: 800-555-5555)
 //owner (ex: Dana Wyatt




}
