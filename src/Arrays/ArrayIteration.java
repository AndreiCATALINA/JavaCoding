package Arrays;

public class ArrayIteration {
    public static void main(String[] args) {

        int[] myIntArray = {1, 3, 4, 5, 6};


        for (int i = myIntArray.length - 1; i >= 0; i--) {
            System.out.println("Elementul de pe pozitia " + i + " este " + myIntArray[i]);
        }

    }
}
