package Loops;

public class BloocksCount {
    public static void main(String[] args) {

        int levels = 3;
        int countBlocks=0;
        for(int i = 1; i<=levels ; i++){
           countBlocks += i*i;
        }
        System.out.println(countBlocks);

    }
}
