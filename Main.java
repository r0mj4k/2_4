import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1 - pole prostokąta");
    System.out.println("2 - pole trójkąta");
    System.out.println("2 - średnia");
    System.out.println("2 - mediana");
    int choice = scanner.nextInt();
    
    
    
    switch(choice){
       case 1:  {
          System.out.println("Podaj a i b");
          double a = scanner.nextDouble();
          double b = scanner.nextDouble();
          System.out.println("Pole = " + a*b);
          break;
        }
       case 2:  {
          System.out.println("Podaj a i h");
          double a = scanner.nextDouble();
          double h = scanner.nextDouble();
          System.out.println("Pole = " + (a*h)/2);
          break;
       }
        case 3: {
          Random random = new Random();
         double n=0;
         for(int i=0; i<10;i++){
           int a = random.nextInt(101);
           // System.out.println(a);
           n+=a;
         }
         System.out.println(n/10);
          break;
         }
        case 4:{
          Random random = new Random();
          double[] n = new double[10];
         for(int i=0; i<10;i++){
           int a = random.nextInt(101);
            n[i] = a;
         }
          
          break;
      }
        
        }
    }
    
  }
