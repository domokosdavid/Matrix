package com.company;

public class Matrix {

    protected int sorokSzama;
    protected int oszlopokSzama;
    protected int [][] matrix;

    public Matrix(int sorokSzama, int oszlopokSzama) {
        this.sorokSzama = sorokSzama;
        this.oszlopokSzama = oszlopokSzama;
        this.matrix = new int[sorokSzama][oszlopokSzama];
    }

    public Matrix(){
        this.sorokSzama = (int)(Math.random()*11)+5;
        this.oszlopokSzama = (int)(Math.random()*11)+5;
        this.matrix = new int[sorokSzama][this.oszlopokSzama];
        this.feltolt();
    }

    protected void feltolt(){
        for (int i = 0; i < this.sorokSzama; i++){
            for (int j = 0; j <this.oszlopokSzama; j++){
                this.matrix[i][j] = (int)(Math.random()* 90)+10;
            }
        }
    }

    public int getSorokSzama(){
        return sorokSzama;
    }

    public int getOszlopokSzama(){
        return oszlopokSzama;
    }

    //döntsük el, hogy négyzetes mátrix-e a mátrixunk
    public boolean isNegyzetes(){
        return this.sorokSzama == this.oszlopokSzama;
    }


    //számok összege
    public long szamokOsszege(){
        int osszeg = 0;
        for (int i = 0; i < sorokSzama; i++){
            for (int j = 0; j < oszlopokSzama; j++){
                osszeg += matrix[i][j];
            }
        }
        return osszeg;
    }

    //párosak
    public int parosakSzama(){
        int db = 0;
        for (int i = 0; i < sorokSzama; i++){
            for (int j = 0; j < oszlopokSzama; j++){
                if(matrix[i][j] % 2 == 0){
                    db++;
                }
            }
        }

        return db;
    }

    //legnagyobb elem
    public int legnagyobbElem(){
        int max = matrix[0][0];
        for (int i = 0; i < sorokSzama; i++){
            for (int j = 0; j < oszlopokSzama; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }


    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.sorokSzama; i++){
            for (int j = 0; j < this.oszlopokSzama; j++){
                s += matrix[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }
}
