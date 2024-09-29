//6.4

package com.gpcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Bản đồ tháng với số ngày và tên
        Map<String, Integer> months = new HashMap<>();
        months.put("January", 31);
        months.put("February", 28); // Sẽ điều chỉnh cho năm nhuận
        months.put("March", 31);
        months.put("April", 30);
        months.put("May", 31);
        months.put("June", 30);
        months.put("July", 31);
        months.put("August", 31);
        months.put("September", 30);
        months.put("October", 31);
        months.put("November", 30);
        months.put("December", 31);
        
        // Thêm các viết tắt
        months.put("Jan.", 31);
        months.put("Jan", 31);
        months.put("Feb.", 28); // Sẽ điều chỉnh cho năm nhuận
        months.put("Feb", 28);
        months.put("Mar.", 31);
        months.put("Mar", 31);
        months.put("Apr.", 30);
        months.put("Apr", 30);
        months.put("May", 31);
        months.put("Jun.", 30);
        months.put("Jun", 30);
        months.put("Jul.", 31);
        months.put("Jul", 31);
        months.put("Aug.", 31);
        months.put("Aug", 31);
        months.put("Sep.", 30);
        months.put("Sep", 30);
        months.put("Oct.", 31);
        months.put("Oct", 31);
        months.put("Nov.", 30);
        months.put("Nov", 30);
        months.put("Dec.", 31);
        months.put("Dec", 31);
        
        // Tháng dưới dạng số
        for (int i = 1; i <= 12; i++) {
            months.put(String.valueOf(i), getDaysInMonth(i));
        }

        int year;
        String monthInput;

        // Lặp lại cho đến khi người dùng nhập tháng và năm hợp lệ
        while (true) {
            System.out.print("Nhập tháng (tên, viết tắt, 3 chữ cái hoặc số): ");
            monthInput = scanner.next();
            System.out.print("Nhập năm (phải là số nguyên dương): ");
            year = scanner.nextInt();
            
            // Kiểm tra năm
            if (year < 0) {
                System.out.println("Năm không hợp lệ. Vui lòng nhập lại.");
                continue;
            }

            // Kiểm tra tháng
            if (!months.containsKey(monthInput)) {
                System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
                continue;
            }
            
            int days = months.get(monthInput);
            // Điều chỉnh cho tháng 2 nếu là năm nhuận
            if (monthInput.equals("February") || monthInput.equals("Feb") || monthInput.equals("Feb.")) {
                if (isLeapYear(year)) {
                    days = 29;
                }
            }

            // Hiển thị kết quả
            System.out.println("Số ngày trong tháng " + monthInput + " của năm " + year + " là: " + days);
            break; // Thoát khỏi vòng lặp khi nhập hợp lệ
        }
        
        scanner.close();
    }

    // Hàm kiểm tra năm nhuận
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Hàm trả về số ngày trong tháng
    private static int getDaysInMonth(int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30;
            case 2: return 28; // sẽ điều chỉnh trong hàm chính nếu năm nhuận
            default: return 0; // Không hợp lệ
        }
    }
}

