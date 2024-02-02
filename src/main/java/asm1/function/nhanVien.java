package asm1.function;

public abstract class nhanVien {
    protected String Id;
    protected String hoTen;
    protected double luongCoBan;
    protected  String phongBan;

    public nhanVien(String Id, String hoTen, double luongCoBan, String phongBan) {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    abstract double getLuong();


}
