package practice.luogu.p5266;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int n = sc.nextInt();
    Map<String, Object> map = new HashMap<>();
    while (n-- > 0) {
      int o = sc.nextInt();
      if (o == 1) {
        map.put(sc.next(), sc.nextInt());
        System.out.println("OK");
      } else if (o == 2) {
        System.out.println(map.getOrDefault(sc.next(), "Not found"));
      } else if (o == 3) {
        String tmp = sc.next();
        if (map.containsKey(tmp)) {
          map.remove(tmp);
          System.out.println("Deleted successfully");
        } else {
          System.out.println("Not found");
        }
      } else if (o == 4) {
        System.out.println(map.size());
      }
    }
  }
}
