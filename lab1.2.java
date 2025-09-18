import java.text.DecimalFormat;//форматув чис

public class Main1 {
    private static double x;//static зміна
    public static void main(String[] args) { // join in program
        DecimalFormat dF = new DecimalFormat( "#.###" );//create object max 3знака ,
        double y=0; // змінна для збереж. результ обчсл.
        x=2; // почат
        while(x<=4) { // cicle
            if(x<3)
            {
            y=Math.tan(x+2);
            }
            else
            {
            y=1/Math.tan(x+2);
            }
            System.out.println("y= "+dF.format(y)+" x= "+dF.format(x));
            x+=0.25;
        }
    }
}
