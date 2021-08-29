package io_binary_file_serialization.bai_tap;

public class SanPham extends Pather {
    private String ma;
    private String ten;
    private String hang;
    private int gia;
    private String mota;

    public SanPham() {
    }

    public SanPham(String ma, String ten, String hang, int gia, String mota) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
        this.mota = mota;
    }

    public String getMa() {
        return this.ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return this.hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getGia() {
        return this.gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return  ma + ", "  + ten + ", "  + hang + ", "  + gia + ", " + mota ;
    }
}
