package diamond;
import java.util.Scanner;
public class Diamond {

        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.print("Enter N:");
            int n=in.nextInt();
            
            for ( int i=1;i<=n;i++){
                
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
              }
                  for ( int j=1;j<=i*2-1;j++)
                  {
                      System.out.print("*");
                  }
                   System.out.println("");
                  }
                  for ( int i=n-1;i>0;i--){
                
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");                   
                }
                for(int j=1;j<=i*2-1;j++){
                    System.out.print("*");
                    }
                      System.out.println(" ");

                    }
                            }
        }
        


   
          
