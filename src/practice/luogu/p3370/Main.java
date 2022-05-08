package practice.luogu.p3370;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    int n = sc.nextInt();
    while(n-- >0){
      set.add(sc.next());
    }
    System.out.println(set.size());
  }
}
