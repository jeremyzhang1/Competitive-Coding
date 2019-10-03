//Quality Adjusted Life Year

import java.util.*;
import java.io.*;

public class Qaly {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double total = 0;
        for(int i = 0; i < n; i++){
            double x = in.nextDouble();
            double y = in.nextDouble();
            total += x*y;
        }
        System.out.printf("%.3f",total);
    }
}
