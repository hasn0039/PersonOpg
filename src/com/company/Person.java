package com.company;

public class Person {

    //fields
    String navn;
    int alder;

    //Konstruktor
    public Person(String navn, int alder){
        this.navn=navn;
        this.alder=alder;

    }

    //metoder
    public String getNavn(){
    return navn;
    }
    public int getAlder(){
    return alder;
    }
    @Override
    public String toString() {
        return "Person= " + navn + ", Alder= " + alder;
    }
    public void hasBday(){
    alder++;
    }


}
