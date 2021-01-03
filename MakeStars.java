import java.util.Scanner;

public class MakeStars {
  public static void main(String[] args){
    Scanner n = new Scanner (System.in);
    while (n.hasNext()) {
      Scanner line = new Scanner (n.nextLine());
      while (line.hasNext()) {
        String next = line.next();
        String new_string = "";
        for (int i = 0; i < next.length(); i++) {
          new_string = new_string + "*";
        }
        System.out.print(new_string + " ");
      }
      System.out.println();
    }
  }
}
