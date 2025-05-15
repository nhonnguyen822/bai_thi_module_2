package enity;

public class BanhAnBNVip extends BenhAn {
    private String loaiVip;
    private String thoiHanVip;

    public BanhAnBNVip(String maBA, String maBN, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String loaiVip, String thoiHanVip) {
        super(maBA, maBN, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public BanhAnBNVip() {
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "BanhAnBNVip{" +
                super.toString() +
                "loaiVip='" + loaiVip + '\'' +
                ", thoiHanVip='" + thoiHanVip + '\'' +
                '}';
    }

    public String convertToString() {
        return super.convertToString() + "," + this.loaiVip + "," + this.thoiHanVip;
    }
}
