package view;

import enity.BenhAn;

import java.util.List;
import java.util.Scanner;

public class BenhAnView {
    public static String inputMaBenhAn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã bệnh án muốn xoá");
        return scanner.nextLine();
    }

    public static void display(List<BenhAn> benhAnList) {
        for (BenhAn benhAn : benhAnList) {
            System.out.println(benhAn);
        }
    }
}
