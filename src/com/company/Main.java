package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // jeg intialisere mit første person objekt p1
	Person p1 = new Person("Hasnain",22);

	//jeg benytter mig get metoderne som jeg lavede i person klassen
    //til at hente navn og alder på p1
        System.out.println(p1.getNavn());
        System.out.println(p1.getAlder());

        //her bruges tostring metode til at printe vores p1 objekt
        System.out.println(p1);

        //her bruger jeg hasBday til at ligge 1 til p1's alder
        p1.hasBday();
        //jeg printer igen for at se om alderen er steget
        System.out.println(p1);
        //_____________________________________________________________

    }
}
