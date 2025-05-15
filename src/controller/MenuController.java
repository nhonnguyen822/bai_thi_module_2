package controller;

import enity.BanhAnBNVip;
import enity.BenhAn;
import enity.BenhAnBNThuong;
import service.BenhAnService;
import service.IBenhAnService;
import view.BenhANBNVipView;
import view.BenhAnBNThuongView;
import view.BenhAnView;

import java.util.List;
import java.util.Scanner;

public class MenuController {
    public static void main(String[] args) {
        chuongTrinhQuanLyBenhAn();
    }

    public static void chuongTrinhQuanLyBenhAn() {
        String exit = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN\n" +
                    "1.Thêm mới\n" +
                    "2.Xoá \n" +
                    "3.Xem danh sách bệnh án \n" +
                    "4. exit\n");
            System.out.println("enter your chose");
            try {
                int chose = Integer.parseInt(scanner.nextLine());
                switch (chose) {
                    case 1:
                        displayListAddBenhAn();
                        break;
                    case 2:
                        String maBenhAn = BenhAnView.inputMaBenhAn();
                        benhAnService.delete(maBenhAn);
                        break;
                    case 3:
                        List<BenhAn> benhAnList = benhAnService.getAll();
                        BenhAnView.display(benhAnList);
                        break;
                    case 4:
                        System.out.println("your chose exit ?  yes or no ");
                        exit = scanner.nextLine().trim().toLowerCase();
                        break;
                    default:
                        System.out.println("re-enter your chose");
                }
                if (chose == 4 && exit.equals("yes")) {
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static final IBenhAnService<BenhAn> benhAnService = new BenhAnService();

    public static void displayListAddBenhAn() {
        String exit = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(".........Menu.......\n" +
                    "1.Thêm bệnh án bệnh nhân thường\n" +
                    "2.thêm bệnh án bệnh nhân vip\n" +
                    "3. return \n");
            System.out.println("enter your chose");
            try {
                int chose = Integer.parseInt(scanner.nextLine());
                switch (chose) {
                    case 1:
                        BenhAnBNThuong benhAnBNThuong = BenhAnBNThuongView.inputDataBenhAn();
                        benhAnService.add(benhAnBNThuong);
                        break;
                    case 2:
                        BanhAnBNVip banhAnBNVip = BenhANBNVipView.inputDataBenhAn();
                        benhAnService.add(banhAnBNVip);
                        break;
                    case 3:
                        System.out.println("your chose exit ?  yes or no ");
                        exit = scanner.nextLine().trim().toLowerCase();
                        break;
                    default:
                        System.out.println("re-return your chose");
                }
                if (chose == 3 && exit.equals("yes")) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
