package nohe;
import java.util.Scanner;
public class Arreglonueve {
  public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
       int r;
      int[] num=new int[9];
       for(r=0;r<=8;r++)
       {
          System.out.print("ingresa valores: ");
        num[r]=leer.nextInt();   
       }
    }
    
}
