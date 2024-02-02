package asm1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chon = 0;
        int nhap;
        cn(chon);

        do{
            System.out.println("-------------------");
            System.out.println("1. Thoat");
            System.out.println("2. Tiep tuc menu");
            System.out.println("-------------------");
            System.out.println("Nhap: ");
            nhap = scanner.nextInt();
            if(nhap==1){
                break;
            }else{
                cn(chon);
            }
        }while(nhap!=1);
    }
    public static void cn(int chon) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("  _____   ____  _   _  _____  __      _______ ______ _______ \n" +
                " |  __ \\ / __ \\| \\ | |/ ____| \\ \\    / |_   _|  ____|__   __|\n" +
                " | |__) | |  | |  \\| | |  __   \\ \\  / /  | | | |__     | |   \n" +
                " |  _  /| |  | | . ` | | |_ |   \\ \\/ /   | | |  __|    | |   \n" +
                " | | \\ \\| |__| | |\\  | |__| |    \\  /   _| |_| |____   | |   \n" +
                " |_|  \\_\\\\____/|_| \\_|\\_____|     \\/   |_____|______|  |_|   \n" +
                "                                                             \n" +
                "                                                             ");

        System.out.println("+-------------------------------------+");
        System.out.println("|            CAC CHUC NANG            |");
        System.out.println("|1. Nhap danh sach                    |");
        System.out.println("|2. Xuat danh sach                    |");
        System.out.println("|3. Tim va hien thi nhan vien         |");
        System.out.println("|4. Xoa nhan vien theo ma             |");
        System.out.println("|5. Cap nhat thong tin nhan vien      |");
        System.out.println("|6. Tim cac nhan vien theo khoan luong|");
        System.out.println("|7. Sap xep nhan vien theo ho va ten  |");
        System.out.println("|8. Sap xep nhan vien theo thu nhap   |");
        System.out.println("|9. Xuat 5 nhan vien co thu nhap cao  |");
        System.out.println("|0. Thoat                             |");
        System.out.println("+-------------------------------------+");

        System.out.print("Chon chuc nang: ");
        chon = scanner.nextInt();
        if (chon != 0) {
            switch (chon) {
                case (1):
                    System.out.print("\033[H\033[2J");
                    System.out.println("nhap danh sach");
                    break;
                case (2):
                    System.out.println("xuat danh sach");
                    break;
                case (3):
                    System.out.println("tim va hien thi nhan vien");
                    break;
                case (4):
                    System.out.println("xoa thong tin nhan vien");
                    break;
                case (5):
                    System.out.println("cap nhat thong tin nhan vien");
                    break;
                case (6):
                    System.out.println("tim cac nhan vien theo khoan luong");
                    break;
                case (7):
                    System.out.println("sap xep nhan vien theo ho va ten");
                    break;
                case (8):
                    System.out.println("sap xep nhan vien theo thu nhap");
                    break;
                case (9):
                    System.out.println("xuat 5 nhan vien co thu nhap cao");
                    break;
                default:
                    System.out.println("Can chon tu 1-9");
                    break;
            }
        }
    }
}