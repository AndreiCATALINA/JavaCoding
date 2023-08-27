package Metods;

public class Example {
    public static void main(String[] args) {
     adder();
    }

  static void adder(){
        int count =0;
        for(int i=1;i<=100;i++){
           count+=i;
        }
        System.out.println(count);
    }
}
