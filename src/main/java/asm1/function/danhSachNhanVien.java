package asm1.function;

import java.util.ArrayList;
import java.util.Scanner;

public class danhSachNhanVien {
    ArrayList<nhanVien> list = new ArrayList<>();

    public void input() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Nhap ma nhan vien: ");
            String ID = sc.nextLine();
            if (ID.equals("") || ID == null) break;
            System.out.printf("Nhap ho va ten nhan vien: ");
            String name = sc.nextLine();
            System.out.printf("Nhap luong nhan vien co ban: ");
            double luongCoBan = sc.nextDouble();
            System.out.printf("phong ban(Hanh chinh/Kinh doanh)");
            String phongBan = sc.nextLine();
            if (phongBan.equalsIgnoreCase("hanh chinh")){
                double ngayCong = sc.nextDouble();
                nhanVien newNV = new nhanVienHanhChinh(ID, name, luongCoBan, phongBan, ngayCong);
                list.add(newNV);
            } else if (phongBan.equalsIgnoreCase("Kinh doanh")){
                System.out.printf("nhap luong kinh doanh: ");
                double luongKinhDoanh = sc.nextDouble();
                nhanVien newNV = new nhanVienKinhDoanh(ID, name, luongCoBan,phongBan, luongKinhDoanh);
                list.add(newNV);
            }else {
                System.out.printf("vui long nhap lai phong ban va cac thong tin khac");
            }


        }while (true);
    }
    public void xuat(){
        for (nhanVien nv: list){
            System.out.printf("Ma nhan vien: %s | ho ten: %s | phong ban: %s | luong: %.2f\n", nv.getId(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong());

        }
    }
}
