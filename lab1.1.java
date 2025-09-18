import java.text.DecimalFormat; //форматув. чис.

import static java.lang.Math.pow;//піднес числа а у степінь b

public class Main {
    private static double x; //оголош. Х статичною на рівні класу
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat( "#.###" );//create object для формат. числ
        double y=0; // змінну save для знач. функц
        x=-3;//початкове зн Х
        while(x<=3) { // включно -3 д 3
        y=Math.pow(x,5)+2*x;
        System.out.println("y= "+dF.format(y)+" x= "+dF.format(x));//вивід у та х
        x+=1; // збіль.
        }
    }
}
