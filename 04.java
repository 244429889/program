import java.util.*;
public class B0411 {
  /**
  * @param args
  */
  public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  while(sc.hasNext()) { 
    int a = sc.nextInt();
    if ( a >= 95 && 100 >= a) {
      System.out.println("您輸入的成績為" + a + "，等級為A+");
    }
    else if ( a >= 90 && 94 >= a) {
      System.out.println("您輸入的成績為" + a + "，等級為A");
    }
    else if ( a >= 85 && 89 >= a) {
    System.out.println("您輸入的成績為" + a + "，等級為B+");
    }
    else if ( a >= 80 && 84 >= a) {
      System.out.println("您輸入的成績為" + a + "，等級為B");
    }
    else if ( a >= 75 && 79 >= a) {
      System.out.println("您輸入的成績為" + a + "，等級為C+");
    }
    else if ( a >= 70 && 74 >= a) {
      System.out.println("您輸入的成績為" + a + "，等級為C");
    }
    else if ( a >= 60 && 69 >= a) {
      System.out.println("您輸入的成績為" + a + "，等級為D");
    }
    else if ( a >= 0 && 59 >= a) {
      System.out.println("您輸入的成績為" + a + "，等級為E");
    }
    else {
      System.out.println("您輸入的成績為" + a + "，等級為無法識別");
    }
}
sc.close();
}
}
  
