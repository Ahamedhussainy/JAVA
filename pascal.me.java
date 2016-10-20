package training;
import java.util.Scanner;
public class Training 
{
    public static void main(String[] args) {
        int i, j, a, b;
        Scanner o =new Scanner(System.in);
        i = o.nextInt();
        for(a=0;a<i;a++){
            j = 1;
            for(b=0;b<=(i-a);b++)
            {
                System.out.print("  ");
            }
            for(int c=0;c<=a;c++){
                System.out.print("    "+j);
                j=j*(a-c)/(c+1);
            }
            System.out.println();
            
        }
        
        
    }
}
