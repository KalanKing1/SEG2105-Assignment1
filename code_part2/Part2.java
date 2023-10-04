import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.Random;
import java.util.Iterator;

public class Part2 {

    public static void main(String args[]){
        int length = 100000000;
        Random rand = new Random();
        Vector<Integer> V = new Vector<Integer>();
        ArrayList<Integer> AL = new ArrayList<Integer>();
        int[] A = new int[length];
        long[] Times = new long[6];
        long[] Sums = new long[3];

        for (int x = 0; x<3; x++) {
            int i = 0;
            Times[x] = System.currentTimeMillis();
            while (i < length) {
                if (x == 0) {
                    V.add(rand.nextInt(10));
                } else if (x == 1) {
                    AL.add(rand.nextInt(10));
                } else {
                    A[i] = rand.nextInt(10);
                }
                i++;
            }
            Times[x] = System.currentTimeMillis() - Times[x];
        }
        Times[3] = System.currentTimeMillis();
        Iterator<Integer> Vi = V.iterator();
        while(Vi.hasNext()){
            Sums[0] +=Vi.next();
        }
        Times[3] = System.currentTimeMillis() - Times[3];
        Times[4] = System.currentTimeMillis();
        Iterator<Integer> ALi = AL.iterator();
        while (ALi.hasNext()){
            Sums[1] += ALi.next();
        }
        Times[4] = System.currentTimeMillis() - Times[4];
        Times[5] = System.currentTimeMillis();
        Iterator<Integer> Ai = Arrays.stream(A).iterator();
        for (int i : A){
            Sums[2] += i;
        }
        Times[5] = System.currentTimeMillis() - Times[5];
        System.out.println("Vector times:" + "\n" + "Assigning: " + Times[0] + "\n" + "Summing: " + Times[3] + "\n" + "\n"
        + "Arraylist times:" + "\n" + "Assigning: " + Times[1] + "\n" + "Summing: " + Times[4] + "\n" +"\n"
        + "Array times:" + "\n" + "Assigning: " + Times[2] + "\n" + "Summing: " + Times[5] + "\n");
    }
}
