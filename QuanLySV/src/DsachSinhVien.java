import java.text.Collator;
import java.util.*;

public class DsachSinhVien {
    List<SinhVien> dsach = new ArrayList<>();

    public DsachSinhVien() {
        dsach.add(new SinhVien("Trần Minh Chiến", "CNTT1", "Nam", 20, 10));
        dsach.add(new SinhVien("Tran Thi B", "CNTT1", "Nu", 19, 7.8));
        dsach.add(new SinhVien("Le Van C", "CNTT2", "Nam", 21, 10));
        dsach.add(new SinhVien("Pham Thi D", "CNTT3", "Nu", 20, 9.1));
        dsach.add(new SinhVien("Do Van E", "CNTT2", "Nam", 22, 7.5));
        dsach.add(new SinhVien("Hoang Thi F", "CNTT1", "Nu", 20, 8.9));
        dsach.add(new SinhVien("Bui Van G", "CNTT3", "Nam", 19, 6.5));
        dsach.add(new SinhVien("Nguyen Thi H", "CNTT2", "Nu", 21, 8.0));
        dsach.add(new SinhVien("Pham Van I", "CNTT1", "Nam", 20, 7.2));
        dsach.add(new SinhVien("Le Thi J", "CNTT3", "Nu", 19, 9.0));
        dsach.add(new SinhVien("Tran Van K", "CNTT1", "Nam", 21, 8.3));
        dsach.add(new SinhVien("Nguyen Thi L", "CNTT2", "Nu", 20, 7.7));
        dsach.add(new SinhVien("Do Van M", "CNTT3", "Nam", 22, 6.8));
        dsach.add(new SinhVien("Bui Thi N", "CNTT1", "Nu", 20, 8.1));
        dsach.add(new SinhVien("Hoang Van O", "CNTT2", "Nam", 19, 7.4));
        dsach.add(new SinhVien("Nguyen Thi P", "CNTT3", "Nu", 21, 8.7));
        dsach.add(new SinhVien("Tran Van Q", "CNTT1", "Nam", 20, 6.9));
        dsach.add(new SinhVien("Pham Thi R", "CNTT2", "Nu", 19, 9.2));
        dsach.add(new SinhVien("Le Van S", "CNTT3", "Nam", 22, 7.9));
        dsach.add(new SinhVien("Do Thi T", "CNTT1", "Nu", 20, 8.4));
    }

    public void  inthongtin() {
        for (SinhVien sv: dsach)
        {
            System.out.println("---------------------");
            System.out.println("tên: "+ sv.getTen());
            System.out.println("lớp: "+ sv.getLop());
            System.out.println("giới tính: "+ sv.getGioitinh());
            System.out.println("tuổi: "+ sv.getTuoi());
            System.out.println("điểm: "+ sv.getDiem());
        }
    }
    public void sapxep() {
        Collator collator = Collator.getInstance(new Locale("vi", "VN"));
        dsach.sort((sv1, sv2) -> collator.compare(sv1.getTen(), sv2.getTen()));
    }
    public void  timkiem() {
        double diemmax = dsach.get(0).getDiem();
        for (SinhVien sv: dsach)
            if (sv.getDiem() > diemmax)
                diemmax = sv.getDiem();

        for (SinhVien sv: dsach)
            if (sv.getDiem() == diemmax)
            {
                System.out.println("----------Sinh Viên có điểm cao  nhất là-----------");
                System.out.println("tên: "+ sv.getTen());
                System.out.println("lớp: "+ sv.getLop());
                System.out.println("giới tính: "+ sv.getGioitinh());
                System.out.println("tuổi: "+ sv.getTuoi());
                System.out.println("điểm: "+ sv.getDiem());
            }
    }
    public void diemdauVaoTrungBinh(){
        double diemTB = 0;
        for (SinhVien sv: dsach)
            diemTB += sv.getDiem();
        diemTB = diemTB/ dsach.size();
        System.out.printf("Điểm trung bình là: %.2f%n", diemTB);
    }
    public void ThemSmSinhVien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String ten = sc.nextLine();

        System.out.print("Nhập lớp: ");
        String lop = sc.nextLine();

        System.out.print("Nhập giới tính: ");
        String gioiTinh = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int tuoi = sc.nextInt();

        System.out.print("Nhập điểm: ");
        double diem = sc.nextDouble();
        SinhVien sv = new SinhVien(ten,lop,gioiTinh,tuoi,diem);
        dsach.add(sv);
    }

}
