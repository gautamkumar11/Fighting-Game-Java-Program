
import java.io.*;
import java.util.*;
public class FightingGame {
   public static void main(String args[] ) throws Exception {

	//Write code here
   int T, N;
   Scanner sc = new Scanner(System.in);
   T = sc.nextInt();
   for(int j =0; j<T; j++)
   {
      int count = 0;
      N = sc.nextInt();
      int[] s = new int[N];
      int[] e = new int[N];
      for(int i =0; i<N; i++)
      {
         s[i] = sc.nextInt();
      }
      Arrays.sort(s);
       for(int i =0; i<N; i++)
      {
         e[i] = sc.nextInt();
      }
      Arrays.sort(e);
       for(int i =0; i<N; i++)
      {
         if(s[i]<e[i])
         {
            
            count++;
           
         }
      }
         if(count == N)
            {
               System.out.println("WIN");
            
            }
         else
         {
            System.out.println("LOSE");
            
         }
      
   }

   }
}
