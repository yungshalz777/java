import java.text.DecimalFormat; //формат чисел

public class Main3 {
    public static double zavdannia(double matrix[][])//dvovimirniy masiv
    {
        double sum = 0;//сума відповід. умові
        double match =0;//лічильник
        for(int i = 0; i < matrix.length; i++) { // <= чи < ?  = вихід за межу масива
        for(int j = 0; j < 9-i; j++) { //j змін від 0 до 9-і
            if(matrix[j][i] >= 0) { // якщо відʼєм = ++sum/match
                sum = sum + matrix[j][i];
                match++;
            }
        }
        }
return sum/ match; //return серед.арифм.
    }
    public static void main(String[] args)//start main
    {
        DecimalFormat dF = new DecimalFormat( "#.###" );//create formarter дл виводу
double[][] A= new double[10][10];//create matrix 10/10
for(int j=0;j<10;j++){
    for(int k=0;k<10;k++) {
        A[j][k] = Math.random() * 10 - 5; // -5 to +5
        System.out.print(dF.format(A[j][k]) + "\t"); //vivid rezult
    }
System.out.println();
}
System.out.println(dF.format(zavdannia(A)));
for(int i =0; i<10;i++){
    System.out.println(A[9-i][i]);//vivid побічн. діагоналі
}
    }
}
