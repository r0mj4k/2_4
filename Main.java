import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1 - pole prostokąta");
    System.out.println("2 - pole trójkąta");
    int choice = scanner.nextInt();
    
    
    
    switch(choice){
       case 1:  {
          System.out.println("Podaj a i b");
          int a = scanner.nextInt();
          int b = scanner.nextInt();
          System.out.println("Pole = " + a*b);
          break;
        }
       case 2:  {
          System.out.println("Podaj a i h");
          int a = scanner.nextInt();
          int h = scanner.nextInt();
          System.out.println("Pole = " + (a*h)/2);
          break;
        }
    }
    
  }
}