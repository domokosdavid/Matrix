package com.company;

public class Main {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        System.out.println("Négyzetes-e: "+ (m.isNegyzetes()? "igen": "nem"));
        System.out.println("A mátrix mérete: "+m.getSorokSzama()+" x "+ m.getOszlopokSzama());
        System.out.println("A számok összege: " + m.szamokOsszege());
        System.out.println(m);

        System.out.println("A mátrixban lévő párosak száma: "+m.parosakSzama());
        System.out.println("A mátrix legnagyobb eleme: "+m.legnagyobbElem());



    }
}

