package ro.fasttrackit.temaCurs10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        int fr[] = new int[101];
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < a.size(); i++) {
            int index = a.get(i);
            fr[index]++;
        }
        for (int i = 1; i <= 100; i++) {
            result = Math.max(result, fr[i] + fr[i - 1]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(n);
        }
        int result = pickingNumbers(list);
        System.out.println(result);
        sc.close();
    }

}
