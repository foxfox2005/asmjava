package asm1.function;

public class nhanVienHanhChinh extends nhanVien {
    private double ngayCong;

    public nhanVienHanhChinh(String Id, String hoTen, double phongBan, double luonCoBan, double ngayCong) {
        super(Id, hoTen, luonCoBan, phongBan);
        this.ngayCong = ngayCong;
    }

    public double getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(double ngayCong) {
        this.ngayCong = ngayCong;
    }

    @Override
    double getLuong() {
        return luongCoBan * ngayCong;
    }
}
