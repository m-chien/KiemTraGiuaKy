import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        DsachSinhVien dsachSinhVien = new DsachSinhVien();
        int chon = 1;
        System.out.println("quản lý danh sách: ");

        while (chon != 0){
            System.out.println("vui lòng chọn:\n0. Thoát\n1. in thông tin\n2. sắp xếp theo tên (A -> Z)" +
                    "\n3. Tìm sinh viên có điểm đầu vào cao nhất\n4. Tính điểm đầu vào trung bình\n5. thêm sinh viên");
            chon = sc.nextInt();
            switch (chon){
                case 0:
                    break;
                case 1:
                    dsachSinhVien.inthongtin(); break;
                case 2:
                    dsachSinhVien.sapxep();break;
                case 3:
                    dsachSinhVien.timkiem();break;
                case 4:
                    dsachSinhVien.diemdauVaoTrungBinh();break;
                case 5:
                    dsachSinhVien.ThemSmSinhVien();break;
            }
        }

    }
}