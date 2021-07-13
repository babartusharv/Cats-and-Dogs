import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CatsAndDogs
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-->0){
            long C = scanner.nextLong();
            long D = scanner.nextLong();
            long N =scanner.nextLong();
            long r = 0;
           if(C>D*2){
                r=C-2*D;
            }
            if (N<=(C+D)*4 && N>=(D+r)*4 && N%4 ==0){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
	}
}