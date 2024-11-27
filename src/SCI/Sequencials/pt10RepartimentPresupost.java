package SCI.Sequencials;

import java.util.Scanner;


public class pt10RepartimentPresupost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int howManyPrinter = sc.nextInt();
        int howManyPc = sc.nextInt();
        int howManyLaptop = sc.nextInt();
        int howManyExternalHardDisk = sc.nextInt();
        int howManyOfficeMaterial = sc.nextInt();

        int printer = 500;
        int pc = 400;
        int laptop = 700;
        int externalHardDisk = 50;
        int officeMaterial = 300;

        int totalPrinter = printer * howManyPrinter;
        int totalPc = pc * howManyPc;
        int totalLaptop = laptop * howManyLaptop;
        int totalExternalHardDisk = externalHardDisk * howManyExternalHardDisk;
        int totalOfficeMaterial = officeMaterial * howManyOfficeMaterial;

        int totalCost = totalPrinter + totalPc + totalLaptop + totalExternalHardDisk + totalOfficeMaterial;

        System.out.println(totalCost);
    }
}
