package service;

import common.DuplicateMedicalRecoreException;
import enity.BanhAnBNVip;
import enity.BenhAn;
import enity.BenhAnBNThuong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnService implements IBenhAnService<BenhAn> {
    private static final IBenhAnBNVipService benhAnBNVipService = new BenhAnBNVipService();
    private static final IBenhAnBNThuongService benhAnBNThuongService = new BenhAnBNThuongService();


    @Override
    public void add(BenhAn benhAn) {
        if (benhAn instanceof BenhAnBNThuong) {
            benhAnBNThuongService.add((BenhAnBNThuong) benhAn);
        } else if (benhAn instanceof BanhAnBNVip) {
            benhAnBNVipService.add((BanhAnBNVip) benhAn);
        }
    }

    @Override
    public void delete(String maBenhAn) {
        Scanner scanner = new Scanner(System.in);
        List<BenhAn> benhAns = getAll();
        boolean flag = false;
        for (BenhAn benhAn : benhAns) {
            if (benhAn.getMaBA().equals(maBenhAn)) {
                if (benhAn instanceof BanhAnBNVip) {
                    System.out.println("ban co muốn xoa  yes /no");
                    String delete = scanner.nextLine().trim().toLowerCase();
                    if(delete.equals("yes")){
                        benhAnBNVipService.delete(maBenhAn);
                        System.out.println("xoá thành công");
                    }
                    flag = true;
                } else if (benhAn instanceof BenhAnBNThuong) {
                    System.out.println("ban co muốn xoa  yes /no");
                    String delete = scanner.nextLine().trim().toLowerCase();
                    if(delete.equals("yes")){
                        benhAnBNThuongService.delete(maBenhAn);
                        System.out.println("xoá thành công");
                        flag = true;
                    }
                }
            }
        }
        if (!flag) {
            try {
                throw new DuplicateMedicalRecoreException("Không tìm thấy mã bệnh nhân");
            } catch (DuplicateMedicalRecoreException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public List<BenhAn> getAll() {
        List<BenhAn> benhAns = new ArrayList<>();
        benhAns.addAll(benhAnBNThuongService.getAll());
        benhAns.addAll(benhAnBNVipService.getAll());
        return benhAns;
    }
}
