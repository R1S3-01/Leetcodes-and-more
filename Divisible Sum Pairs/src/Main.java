import jdk.jfr.Frequency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(6);
        arr.add(1);
        arr.add(2);
        System.out.println(divisibleSumPairs(6,3,arr));

    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int total=0;
        for (int i = 0; i < n; i++) {
            int firstNum = ar.get(i);
            for (int j = i + 1; j < n; j++) {
                if ((firstNum + ar.get(j))%k==0) {
                    total+=1;
                }
            }
        }
        return total;
    }
}