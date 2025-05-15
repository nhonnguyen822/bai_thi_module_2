package repository;

import common.AutoAddId;
import common.ReadAndWriteDaTa;
import enity.BenhAnBNThuong;


import java.util.ArrayList;
import java.util.List;


public class BenhAnBNThuongRepository implements IBenhAnBNThuongRepository {
    private static final String BENH_AN_BENH_NHAN_THUONG_FILE = "src/data/benh_an_benh_nhan_thuong.csv";
    private static final boolean NOT_APPEND = false;
    private static final boolean APPEND = true;


    private static List<String> convertToListString(List<BenhAnBNThuong> benhAnBNThuongs) {
        List<String> stringList = new ArrayList<>();
        for (BenhAnBNThuong benhAnBNThuong : benhAnBNThuongs) {
            String line = benhAnBNThuong.convertToString();
            stringList.add(line);
        }
        return stringList;
    }

    private static List<BenhAnBNThuong> convertToListBenhAN(List<String> stringList) {
        List<BenhAnBNThuong> benhAnBNThuongs = new ArrayList<>();
        for (String string : stringList) {
            String[] line = string.split(",");
            if (line.length == 8) {
                try {
                    String maBA = line[1];
                    String maBN = line[2];
                    String tenBenhNhan = line[3];
                    String ngayNhapVien = line[4];
                    String ngayRaVien = line[5];
                    String lyDoNhapVien = line[6];
                    int phiNamVien = Integer.parseInt(line[7]);
                    benhAnBNThuongs.add(new BenhAnBNThuong(maBA, maBN, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return benhAnBNThuongs;
    }

    @Override
    public void add(BenhAnBNThuong benhAnBNThuong) {
        List<BenhAnBNThuong> benhAnBNThuongs = new ArrayList<>();
        benhAnBNThuong.setId(AutoAddId.updateId());
        benhAnBNThuongs.add(benhAnBNThuong);
        List<String> stringList = convertToListString(benhAnBNThuongs);
        ReadAndWriteDaTa.writeFileCSV(BENH_AN_BENH_NHAN_THUONG_FILE, stringList, APPEND);
    }

    @Override
    public void delete(String maBenhAn) {
        List<BenhAnBNThuong> benhAnBNThuongs = getAll();
        for (int i = 0; i < benhAnBNThuongs.size(); i++) {
            if (benhAnBNThuongs.get(i).getMaBA().equals(maBenhAn)) {
                benhAnBNThuongs.remove(i);
                break;
            }
        }
        List<String> stringList = convertToListString(benhAnBNThuongs);
        ReadAndWriteDaTa.writeFileCSV(BENH_AN_BENH_NHAN_THUONG_FILE, stringList, NOT_APPEND);
    }

    @Override
    public List<BenhAnBNThuong> getAll() {
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(BENH_AN_BENH_NHAN_THUONG_FILE);
        return convertToListBenhAN(stringList);
    }
}
