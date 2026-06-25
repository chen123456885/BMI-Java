import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat DF = new DecimalFormat("#.##");

        System.out.print("請輸入您的體重(公斤): ");
        double weight = scanner.nextDouble();

        System.out.print("請輸入您的身高(公分): ");
        double height = scanner.nextDouble() / 100;

        // 計算 BMI 並格式化小數點位數
        double bmi = Double.parseDouble(DF.format(weight / (height * height)));
        System.out.println("您的BMI數值為" + bmi);

        // 判斷 BMI 區間（這裡順手幫你把原圖重複的「過輕」修正為標準定義了！）
        if (bmi < 18.5) {
            System.out.println("您屬於過輕類型");
        } else if (bmi < 24) {
            System.out.println("您屬於正常類型");
        } else if (bmi < 30) {
            System.out.println("您屬於過重類型");
        } else {
            System.out.println("您屬於肥胖類型");
        }
    }
}