import java.util.Scanner;

public class C0411 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            switch (n) {
                case 1:
                    if (a <= 0 || b <= 0 || c <= 0) {
                        System.out.println("您選擇1，輸入格式錯誤，請輸入大於0的數值");
                    } else if ((a + b) > c && (a + c) > b && (c + b) > a) {
                        System.out.println("您選擇1，三邊長" + a + "、" + b + "、" + c + "可構成三角形");
                    } else {
                        System.out.println("您選擇1，三邊長" + a + "、" + b + "、" + c + "無法構成三角形");
                    }
                    break;

                case 2:
                    double d = (a + b) * c / 2.0;
                    if (a <= 0 || b <= 0 || c <= 0) {
                        System.out.println("您選擇2，輸入格式錯誤，請輸入大於0的數值");
                    } else if ((c % 2) != 0) {
                        System.out.println("您選擇2，上底" + a + "、下底" + b + "、高" + c + "，梯形面積為" + d);
                    } else if ((c % 2) == 0) {
                        System.out.println("您選擇2，上底" + a + "、下底" + b + "、高" + c + "，梯形面積為" + ((a + b) * c / 2));
                    }
                    break;

                default:
                    System.out.println("您選擇" + n + "，沒有此選項");
                    break;
            }
        }
    }
}

sc.close();
}
}

