package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.printing(true,5);
        System.out.println(printer.getPagesPrinted());
        System.out.println(printer.getTonerLevel());
        printer.printing(true, 2);
        System.out.println(printer.getPagesPrinted());
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getTotalPages());

        printer.fillToner();
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getTotalPages());
        printer.printing(true,49);
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getPagesPrinted());
        System.out.println(printer.getTotalPages());



    }
}
