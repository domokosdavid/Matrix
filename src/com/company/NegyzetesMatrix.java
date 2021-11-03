package com.company;

public class NegyzetesMatrix extends Matrix{

    public NegyzetesMatrix(int sorokSzama){
        super(sorokSzama, sorokSzama);
    }

    public NegyzetesMatrix(){
        this((int)(Math.random()*10)+5);
        this.feltolt();
    }

    //főátló összege

    public int foatloOsszege(){
        int sum = 0;
        for (int i = 0; i < this.matrix.length; i++){
            sum += matrix[i][i];
        }
        return sum;
    }

    //mellékátló legnagyobb eleme
    public int mellekatloLegnagyobbEleme(){
        int max = matrix[0][this.oszlopokSzama-1];
        for (int i = 0; i < this.sorokSzama; i++) {
            if (max < matrix[i][(this.oszlopokSzama-1)-i]) {
                max = matrix[i][(this.oszlopokSzama-1)-i];
            }
        }
        return max;
    }

}
