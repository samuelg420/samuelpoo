
package javaapplication2;

import java.util.Scanner;

public class alturas {

   
    public static void main(String[] args)
    {
       Scanner sc = new Scanner (System.in);
       double [] estatura = new double [5];
       int promedioMenor=0;
       int promedioMayor=0;
       double suma = 0;
       
       for (int i = 0; i<estatura.length;i++)
       {
           System.out.println("Escriba"+(i+1)+"estatura : ");
           estatura[i]=sc.nextDouble();
           suma+=estatura[i];
           
       }
       
       suma/=5;
       for(int i =0;i<estatura.length;i++)
       {    
           if (estatura[i]>suma)
           {
               promedioMayor++;
           }
           else
           {
               promedioMenor++;
           }
       }
        System.out.println("si hay" + promedioMayor + "personas arriba del promedio");
        System.out.println("si hay" + promedioMenor + "personas debajo del promedio");
    }
    
}
