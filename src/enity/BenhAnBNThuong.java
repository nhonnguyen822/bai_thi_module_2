package enity;


public class BenhAnBNThuong extends BenhAn {
    private int phiNamVien;

    public BenhAnBNThuong() {
    }

    public BenhAnBNThuong(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public BenhAnBNThuong(String maBA,String maBN, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, int phiNamVien) {
        super(maBA,maBN, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public int getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnBNThuong{" +
                super.toString() +
                "phiNamVien=" + phiNamVien +
                '}';
    }

    public String convertToString() {
        return super.convertToString() + "," + this.phiNamVien;
    }
}
