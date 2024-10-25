//2.2.6

package com.gpcoder;

import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menu
        System.out.println("Chọn loại phương trình cần giải:");
        System.out.println("1. Phương trình bậc nhất một ẩn (ax + b = 0)");
        System.out.println("2. Hệ phương trình bậc nhất hai ẩn");
        System.out.println("3. Phương trình bậc hai một ẩn (ax^2 + bx + c = 0)");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                giaiPhuongTrinhBacNhat(scanner);
                break;
            case 2:
                giaiHePhuongTrinhBacNhat(scanner);
                break;
            case 3:
                giaiPhuongTrinhBacHai(scanner);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
        
        scanner.close();
    }

    // Giải phương trình bậc nhất một ẩn (ax + b = 0)
    public static void giaiPhuongTrinhBacNhat(Scanner scanner) {
        System.out.println("Giải phương trình ax + b = 0");
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
    }

    // Giải hệ phương trình bậc nhất hai ẩn
    public static void giaiHePhuongTrinhBacNhat(Scanner scanner) {
        System.out.println("Giải hệ phương trình bậc nhất hai ẩn:");
        System.out.println("a11*x1 + a12*x2 = b1");
        System.out.println("a21*x1 + a22*x2 = b2");
        
        // Nhập các hệ số
        System.out.print("Nhập a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Nhập a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Nhập b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Nhập a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Nhập a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Nhập b2: ");
        double b2 = scanner.nextDouble();
        
        // Tính định thức
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        
        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Nghiệm của hệ là x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // Giải phương trình bậc hai một ẩn (ax^2 + bx + c = 0)
    public static void giaiPhuongTrinhBacHai(Scanner scanner) {
        System.out.println("Giải phương trình ax^2 + bx + c = 0");
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        
        if (a == 0) {
            System.out.println("Đây không phải là phương trình bậc hai. Đây là phương trình bậc nhất.");
            giaiPhuongTrinhBacNhat(scanner);
        } else {
            double delta = b * b - 4 * a * c;
            
            if (delta > 0) {
                double nghiem1 = (-b + Math.sqrt(delta)) / (2 * a);
                double nghiem2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + nghiem1 + ", x2 = " + nghiem2);
            } else if (delta == 0) {
                double nghiemKep = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + nghiemKep);
            } else {
                System.out.println("Phương trình vô nghiệm (không có nghiệm thực).");
            }
        }
    }
}

