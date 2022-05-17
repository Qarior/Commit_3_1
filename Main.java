import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    boolean shouldContinue = true;

    while(shouldContinue){
      System.out.println("Aby dodac studenta wpisz '1' ");
      System.out.println("Aby opuscic program wpisz '9' ");
      int opcje = scanner.nextInt();
      switch (opcje){
        case 1:
          case1();
          System.out.println("Student zostal dodany, zaraz powrocisz do MENU\n");
          break;

        case 9:
          System.out.println("Do zobaczenia !");
          shouldContinue = false;
          break;
      }
    }
    }
  private static void case1() throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj imie studenta: ");
    String Imie = scanner.nextLine();

    System.out.println("Podaj wiek studenta: ");
    int Wiek = scanner.nextInt();

    Service1 s = new Service1();

    s.addStudent(new Student(Imie, Wiek));
  }
}