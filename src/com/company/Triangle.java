package com.company;

class Triangle extends Figure{

    private int size;

    public Triangle(int size) {
        this.size = size;
    }

    void print() {
        for(int i=0; i<size; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("o  ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
