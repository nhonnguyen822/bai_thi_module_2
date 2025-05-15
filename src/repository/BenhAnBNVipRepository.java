package repository;

import common.AutoAddId;
import common.ReadAndWriteDaTa;
import enity.BanhAnBNVip;


import java.util.ArrayList;
import java.util.List;

public class BenhAnBNVipRepository implements IBenhAnBNVipRepository {

    private static final String BENH_AN_BENH_NHAN_VIP_FILE = "src/data/benh_an_benh_nhan_vip.csv";
    private static final boolean NOT_APPEND = false;
    private static final boolean APPEND = true;


    private static List<String> convertToListString(List<BanhAnBNVip> banhAnBNVips) {
        List<String> stringList = new ArrayList<>();
        for (BanhAnBNVip banhAnBNVip : banhAnBNVips) {
            String line = banhAnBNVip.convertToString();
            stringList.add(line);
        }
        return stringList;
    }

    private static List<BanhAnBNVip> convertToListBenhAN(List<String> stringList) {
        List<BanhAnBNVip> banhAnBNVips = new ArrayList<>();
        for (String string : stringList) {
            String[] line = string.split(",");
            if (line.length == 9) {
                try {
                    String maBA = line[1];
                    String maBN = line[2];
                    String tenBenhNhan = line[3];
                    String ngayNhapVien = line[4];
                    String ngayRaVien = line[5];
                    String lyDoNhapVien = line[6];
                    String loaiVip = line[7];
                    String thoiHanVip = line[8];
                    banhAnBNVips.add(new BanhAnBNVip(maBA, maBN, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVip, thoiHanVip));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return banhAnBNVips;
    }

    @Override
    public void add(BanhAnBNVip banhAnBNVip) {
        List<BanhAnBNVip> banhAnBNVips = new ArrayList<>();
        banhAnBNVip.setId(AutoAddId.updateId());
        banhAnBNVips.add(banhAnBNVip);
        List<String> stringList = convertToListString(banhAnBNVips);
        ReadAndWriteDaTa.writeFileCSV(BENH_AN_BENH_NHAN_VIP_FILE, stringList, APPEND);
    }

    @Override
    public void delete(String maBenhAn) {
        List<BanhAnBNVip> banhAnBNVips = getAll();
        for (int i = 0; i < banhAnBNVips.size(); i++) {
            if (banhAnBNVips.get(i).getMaBA().equals(maBenhAn)) {
                banhAnBNVips.remove(i);
                break;
            }
        }
        List<String> stringList = convertToListString(banhAnBNVips);
        ReadAndWriteDaTa.writeFileCSV(BENH_AN_BENH_NHAN_VIP_FILE, stringList, NOT_APPEND);
    }

    @Override
    public List<BanhAnBNVip> getAll() {
        List<String> stringList = ReadAndWriteDaTa.readFileCSV(BENH_AN_BENH_NHAN_VIP_FILE);
        return convertToListBenhAN(stringList);
    }
}
