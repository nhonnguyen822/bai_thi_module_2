package view;

import common.Valiadate;
import enity.BanhAnBNVip;
import java.util.Scanner;

public class BenhANBNVipView {
    public static BanhAnBNVip inputDataBenhAn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã bệnh án ");
        String maBA = scanner.nextLine();
        while (!Valiadate.isInputCodeBenhAN(maBA)){
            System.out.println("nhập mã bệnh án đúng định dạng BA-XXX");
            maBA = scanner.nextLine();
        }
        System.out.println("nhập mã bệnh nhân ");
        String maBN = scanner.nextLine();
        while (!Valiadate.isInputCodeBenhNhan(maBN)){
            System.out.println("nhập mã bệnh  nhân đúng định dạng BN-XXX");
            maBN = scanner.nextLine();
        }
        System.out.println("nhập tên bệnh nhân ");
        String tenBenhNhan = scanner.nextLine();
        while (!Valiadate.isInputName(tenBenhNhan)){
            System.out.println("nhập lại tên bệnh nhân :chũ cái đàu in hoa");
             tenBenhNhan = scanner.nextLine();
        }
        System.out.println("nhập ngày nhập viện  ");
        String ngayNhapVien = scanner.nextLine();
        while (!Valiadate.isInputDay(ngayNhapVien)){
            System.out.println("nhập lại ngày nhập viên dung đinh dạng dd/MM/yyyy  ");
            ngayNhapVien = scanner.nextLine();
        }
        System.out.println("nhập ngày ra viện ");
        String ngayRaVien = scanner.nextLine();
        while (!Valiadate.isInputDay(ngayRaVien)) {
            System.out.println("nhập ngày nhập viên dung đinh dạng dd/MM/yyyy  ");
            ngayRaVien = scanner.nextLine();
        }
        System.out.println("nhập lý do nhập viện");
        String lyDoNhapVien = scanner.nextLine();
        System.out.println("nhập loại víp ");
        String loaiVip = scanner.nextLine();
        System.out.println("nhập lý do nhập viện ");
        System.out.println("nhập thời hạn víp");
        String thoiHanVip = scanner.nextLine();
        return new BanhAnBNVip(maBA, maBN, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVip, thoiHanVip);
    }
}
