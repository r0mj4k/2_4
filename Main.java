import java.util.Random;
import java.util.Scanner;
import java.util.Spliterator;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1 - pole prostokąta");
    System.out.println("2 - pole trójkąta");
    System.out.println("3 - średnia");
    System.out.println("4 - mediana");
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
         System.out.println("Średnia = " + n/10);
          break;
         }
        case 4:{
          Random random = new Random();
          int[] n = new int[10];
         for(int i=0; i<10;i++){
           int a = random.nextInt(101);
            n[i] = a;
         }
          System.out.println("Przed sortowaniem:");
          System.out.print("[ ");
          for(int i=0;i<10;i++){
            System.out.print(n[i]+" ");
          }
          System.out.println("]");
          
          int pom;
           for(int i=0; i<10;i++){
            for(int j=0;j<9;j++){
             if(n[j+1]<n[j]){
               pom = n[j];
               n[j] = n[j+1];
               n[j+1] = pom;
              }
            }
           }
          System.out.println("Po sortowaniu:");
          System.out.print("[ ");
          for(int i=0;i<10;i++){
            System.out.print(n[i]+" ");
          }
          System.out.println("]");
          System.out.println("Mediana = " + (double)(n[4]+n[5])/2);
          break;
        }
    }
    
  }
}