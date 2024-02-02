package asm1.function;

public class nhanVienKinhDoanh extends nhanVien {
private double luongKinhDoanh;

    public nhanVienKinhDoanh(String Id, String hoTen, double luongCoBan, String phongBan, double luongKinhDoanh) {
        super(Id, hoTen, luongCoBan, phongBan);
        this.luongKinhDoanh = luongKinhDoanh;
    }

    public double getLuongKinhDoanh() {
        return luongKinhDoanh;
    }

    public void setLuongKinhDoanh(double luongKinhDoanh) {
        this.luongKinhDoanh = luongKinhDoanh;
    }

    @Override
    double getLuong() {
        return luongCoBan + luongKinhDoanh;
    }
}
