//6.2

package com.gpcoder;

import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();

        // Nhập tuổi
        System.out.print("Bạn bao nhiêu tuổi? ");
        int age = scanner.nextInt();

        // Nhập chiều cao (số thực)
        System.out.print("Chiều cao của bạn (m): ");
        double height = scanner.nextDouble();

        // Nhập một câu
        System.out.print("Nhập một câu bất kỳ: ");
        String sentence = scanner.nextLine();

        // In ra kết quả
        System.out.println("Xin chào " + name + ", bạn " + age + " tuổi và cao " + height + "m.");
        System.out.println("Câu bạn vừa nhập là: " + sentence);

        // Kiểm tra một điều kiện
        System.out.print("Bạn có thích lập trình không? (true/false): ");
        boolean lovesProgramming = scanner.nextBoolean();
        if (lovesProgramming) {
            System.out.println("Tuyệt vời! Cùng nhau khám phá thế giới lập trình nhé.");
        } else {
            System.out.println("Không sao, hãy thử học lập trình nhé, nó rất thú vị đấy.");
        }

        scanner.close(); // Đóng đối tượng Scanner khi không còn sử dụng
    }
}
