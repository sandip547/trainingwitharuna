package com.info;

public class ArrayExample {
    public static void main(String[] args) {
//        int [] loEme  = new int[4];
//        for (int i = 0; i < loEme.length; i++){
//            loEme[i] = 100+i;
//        }
////        for(int i =3; i>=0 ;i--){
////            System.out.println(loEme[i]);
////        }
//
//        for (int i: loEme){
//            if(i ==102){
//                System.out.println("found");
//                break;
//            }
//

       // }

        int [][] multiArray = new int[2][2];
        int [][] multi = new int[2][2];
        int count = 2;
        int multiCount = 3;
        // inserting the values in multi Array
        for(int i = 0;i<multiArray.length;i++){
            for (int j=0;j<multiArray[0].length;j++){
                multiArray[i][j] = count;
                count = count + 2;
            }
        }
        //displaying values in multi Array
        System.out.println("orginal Array");
        for(int i = 0;i<multiArray.length;i++){
            for (int j=0;j<multiArray[0].length;j++){

                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
        // replacing the value 2 wiht 0
        System.out.println("Changed Arrray");
        for(int i = 0;i<multiArray.length;i++){
            for (int j=0;j<multiArray[0].length;j++){
                int c = multiArray[i][j] ;
                if(c == 2){
                    multiArray[i][j] =0;
                }
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }

//        for(int i = 0;i<multiArray.length;i++){
//            for (int j=0;j<multiArray[0].length;j++){
//                System.out.print(multiArray[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        for(int i = 0;i<multi.length;i++){
//            for (int j=0;j<multi[0].length;j++){
//                System.out.print(multi[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
