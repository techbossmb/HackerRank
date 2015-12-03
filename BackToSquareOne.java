import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
* IEEEXtreme 8.0
* https://www.hackerrank.com/contests/ieeextreme-challenges/challenges/back-to-square-1
*/
public class BackToSquareOne{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            if(n < 2)continue;
            double[] nextPrbs = new double[n-1];
            double[] eigens = new double[n-1];
            double currentEigen = 1;
            double sum = 1;
            for(int i = 0; i < n-1; i++){
                double prb = s.nextDouble(); 
                nextPrbs[i] = prb;
                eigens[i] = currentEigen * nextPrbs[i];
                currentEigen = eigens[i];
                sum += eigens[i];
            }
            double result = sum/eigens[eigens.length-1];
            System.out.println(Math.round(result));
        }
    }
}
