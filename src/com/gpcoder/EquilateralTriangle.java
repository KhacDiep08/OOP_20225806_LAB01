//6.3

package com.gpcoder;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập chiều cao n từ người dùng
        System.out.print("Nhập chiều cao của tam giác (n): ");
        int n = scanner.nextInt();
        
        // Hiển thị tam giác đều
        for (int i = 1; i <= n; i++) {
            // In khoảng trắng trước dấu sao
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // In dấu sao
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Chuyển dòng sau mỗi hàng
            System.out.println();
        }
        
        scanner.close();
    }
}

