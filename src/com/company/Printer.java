package com.company;

public class Printer {
    private double tonerLevel;
    private int pagesPrinted;
    private int totalPages;

    public Printer() {
        this.tonerLevel = 100;
        this.pagesPrinted = 0;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void fillToner() {
        this.tonerLevel = 100;

        System.out.println("fillToner()-> filling toner");
    }

    public void printing(boolean isDuplex, int pages) {

        duplex(isDuplex);

        if (reduceTonerLevel(pages) <= 0) {
            System.out.println("Printer is out of ink");

        } else {
            System.out.println("printing()-> printing");
            if (isDuplex) {
                this.pagesPrinted = (int) Math.round((double) pages / 2);
            } else {
                this.pagesPrinted = pages;

            }
            this.totalPages += this.pagesPrinted;
            this.tonerLevel = reduceTonerLevel(pages);
        }
    }

    private double reduceTonerLevel(int pages) {
        double result = this.tonerLevel - pages * 0.2;
        if (result < 0) {

            return -1;
        } else {
            return result;
        }

    }

    private void duplex(boolean isDuplex) {
        if (isDuplex) {
            System.out.println("isDuplex()-> printing on both sides");
        } else {
            System.out.println("!isDuplex()-> printing on one side");
        }
    }
}
