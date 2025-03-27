import java.util.*;
public class A0411 {
/**
* @param args
*/
  public static void main(String[] args) {
  // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) { 
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = a + b + c;
      int e = a * b * c;
      System.out.println("您輸入的數值為" + a + "、" + b + "、" + c + "，" + a + " + " + b + " + " + c + " = " + d + "，" + a + " * " + b + " * " + c + " = " + e);
    }
    sc.close();
  }
}
