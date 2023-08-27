package OOP.clases;

public class OuterClass {

    private int number=5;

    public class innerClass{

        public void printNumber(){
            System.out.println(number);
        }

    }
  public innerClass init(){
     return new innerClass();
    }
}
