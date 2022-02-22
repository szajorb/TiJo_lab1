package com.company;


public class Main {



    public static void main(String[] args) {
        Square square = new Square(5);
        printFigure(square);

        Triangle triangle = new Triangle(5);
        printFigure(triangle);

        Square2 square2 = new Square2(5);
        printFigure(square2);

    }
    static void printFigure( Figure figure) { figure.print();
    }
}