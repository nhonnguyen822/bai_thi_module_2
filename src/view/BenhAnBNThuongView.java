package view;

import common.Valiadate;
import enity.BenhAnBNThuong;

import java.util.Scanner;

public class BenhAnBNThuongView {
    public static BenhAnBNThuong inputDataBenhAn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã bệnh án ");
        String maBA = scanner.nextLine();
        while (!Valiadate.isInputCodeBenhAN(maBA)) {
            System.out.println("nhập mã bệnh án đúng định dạng BA-XXX");
            maBA = scanner.nextLine();
        }
        System.out.println("nhập mã bệnh nhân ");
        String maBN = scanner.nextLine();

        while (!Valiadate.isInputCodeBenhNhan(maBN)) {
            System.out.println("nhập mã bệnh  nhân đúng định dạng BN-XXX");
            maBN = scanner.nextLine();
        }
        System.out.println("nhập tên bệnh nhân ");
        String tenBenhNhan = scanner.nextLine();
        while (!Valiadate.isInputName(tenBenhNhan)) {
            System.out.println("nhập lại tên bệnh nhân :chũ cái đàu in hoa");
            tenBenhNhan = scanner.nextLine();
        }
        System.out.println("nhập ngày nhập v viện  ");
        String ngayNhapVien = scanner.nextLine();
        while (!Valiadate.isInputDay(ngayNhapVien)) {
            System.out.println("nhập ngày nhập viên dung đinh dạng dd/MM/yyyy  ");
            ngayNhapVien = scanner.nextLine();
        }
        System.out.println("nhập ngày ra viện ");
        String ngayRaVien = scanner.nextLine();
        while (!Valiadate.isInputDay(ngayRaVien)) {
            System.out.println("nhập ngày nhập viên dung đinh dạng dd/MM/yyyy  ");
            ngayRaVien = scanner.nextLine();
        }
        System.out.println("nhập lý do nhập viện ");
        String lyDoNhapVien = scanner.nextLine();

        System.out.println("nhập phí nằm viện");
        int phiNamVien = Integer.parseInt(scanner.nextLine());
        return new BenhAnBNThuong(maBA, maBN, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien);
    }
}
