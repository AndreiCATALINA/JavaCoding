package Metods;

public class MetodWithObjects {
    public static void main(String[] args) {
        MetodWithObjects obiect =new MetodWithObjects();//am facut un obiect ca sa pot da call fara static
        obiect.checkNumber(3);

    }

   void checkNumber(int number){
     if(number%2==0) {
      System.out.println("Your number is even.");
     }else{
         System.out.println("Your number is odd.");
     }
     }

    }

