import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {



        int Lotto[]=new int[6];
        for(int i=0;i<Lotto.length;i++){
            Lotto[i]=new Random().nextInt(6)+1;
        }
    }
}