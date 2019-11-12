package array2;

import java.util.Random;

public class array2 {

    public static void main(String[] args) {
        array2.test21();

    }
    public static void test21() {
        Random rn = new Random();
        int[][] mapa = new int[4][4];

        // int[][] matica = {{3, 4, 5, 6}, {10, 11, 2, 3}, {1, 7, 3, 1}};





        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) { // generuje random cisla
              mapa[i][j] = rn.nextInt(40)+1;


            }
            System.out.println(""); //odradkovanie
        }



//        System.out.println(mapa[0].length); // pocet stlpcov
//        System.out.println(mapa.length); //pocet riadkov

        int count = 0;
        int max= mapa [0][0];
        int min = mapa [0][0];

        for (int i = 0; i < mapa.length; i++) { //pruchods pres pole poli
            for (int j = 0; j < mapa[i].length; j++) { //pruchod samotnym polem (radkem)
                if(mapa [i][j] >max)
                    max = mapa[i][j];

                if(mapa [i] [j] < min)
                    min = mapa [i] [j];

                count+=mapa[i] [j];
                System.out.print(mapa[i][j] + " "); //bez odradkovani
            }
            System.out.println(""); //odradkovanie
        }
        System.out.println();

        System.out.println("Count is : " + count);
        System.out.println("Max value is: " +max);
        System.out.println("Min value is: " +min);


    }
}

