package com.exosolve.exceptionhandling;

public class TestException {
// throw

  public void checkForDisplayException(int a){
      if(a == 5){
            throw  new DisplayException("This a case of value mathching 5: matched value exception");
      }else {
          System.out.println(a);
      }
  }


    public void checkArithmeticException() throws ArithmeticException,ArrayIndexOutOfBoundsException{

        int a = 2/2;
        System.out.println(a);
        int [] arr = new int [5];
        System.out.println(arr[5]);
    }


    public static void main(String[] args) {
        TestException t = new TestException();
        try {
            t.checkForDisplayException(5);

        }catch (DisplayException e){
            System.out.println(e.getMessage());
        }
//        try {
//            new TestException().checkArithmeticException();
//            //resource based class -- File Handling Classes, DatabaseClasses
//
//        }catch (ArithmeticException e){
//            System.out.println("This is a arithmetic Exception : " + e);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("try catch has been executed");
//        }


//        try {
//            int a = 2/0;
//
//
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            int  [] arr = new int[6];
//            arr[8] = 81;
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
//
//
      System.out.println("This is my first exception handling code");


    }
}
