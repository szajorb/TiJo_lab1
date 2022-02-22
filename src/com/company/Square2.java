package com.company;

class Square2 extends Figure{

    int size;

    public Square2(int size) {
        this.size = size;
    }

    void print(){
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                System.out.print("o  ");
            }
            System.out.println();
        }
        System.out.println();
    }

}