package SCI.Seqüencials;

import java.util.Scanner;


public class pt10RepartimentPresupost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int howManyPrinter = scanner.nextInt();
        int howManyPc = scanner.nextInt();
        int howManyLaptop = scanner.nextInt();
        int howManyExternalHardDisk = scanner.nextInt();
        int howManyOfficeMaterial = scanner.nextInt();

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
