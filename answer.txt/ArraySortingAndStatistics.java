//6.5

package com.gpcoder;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingAndStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập kích thước mảng
        System.out.print("Nhập kích thước mảng: ");
        int size = scanner.nextInt();
        
        // Tạo mảng
        double[] numbers = new double[size];
        
        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        
        // Sắp xếp mảng
        Arrays.sort(numbers);
        
        // Tính tổng và trung bình
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / size;

        // Hiển thị kết quả
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(numbers));
        System.out.println("Tổng của các phần tử trong mảng: " + sum);
        System.out.println("Giá trị trung bình của các phần tử trong mảng: " + average);
        
        scanner.close();
    }
}

