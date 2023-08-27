package Varargs;

public class VarargsEx {
    public static void main(String[] args) {
        VarargsEx object = new VarargsEx();
        System.out.println(object.sum(10,6));
        float varsum = object.varsum("Paul", 3, 4, 5,10);


    }

    public int sum(int num1,int num2){
        int result = num1+num2;
        return result;
    }

    public float varsum(String name, int... numbers) {
        float sum = 0.0f;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        float average = sum / numbers.length;

        System.out.println("Media aritmetica a notelor pentru studentul " + name + " este: " + average);

        return average;
    }




}
