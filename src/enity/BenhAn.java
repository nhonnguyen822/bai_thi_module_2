package enity;

public abstract class BenhAn {
    private int id;
    private String maBA;
    private String maBN;
    private String tenBenhNhan;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String lyDoNhapVien;

    public BenhAn(String maBA, String maBN, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien) {
        this.maBA = maBA;
        this.tenBenhNhan = tenBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public BenhAn() {
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaBA() {
        return maBA;
    }

    public void setMaBA(String maBA) {
        this.maBA = maBA;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }


    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", maBA='" + maBA + '\'' +
                        ", tenBenhNhan='" + tenBenhNhan + '\'' +
                        ", ngayNhapVien=" + ngayNhapVien +
                        ", ngayRaVien=" + ngayRaVien +
                        ", lyDoNhapVien='" + lyDoNhapVien + '\''
                ;
    }

    public String convertToString() {
        return this.id + "," + this.maBA+"," +this.maBA + "," + this.tenBenhNhan + "," + this.ngayNhapVien + "," + this.ngayRaVien + "," + this.lyDoNhapVien;
    }
}
