package OOP.clases;

public class OuterInnerMain {

    public static void main(String[] args) {

        OuterClass objectFromOuterClass = new OuterClass();

        OuterClass.innerClass objectFromInnerClass= objectFromOuterClass.init();
        OuterClass.innerClass anotherObjectFromInnerClass = objectFromOuterClass.new innerClass();

        objectFromInnerClass.printNumber();
        anotherObjectFromInnerClass.printNumber();

    }

}
