public class SinhVien {
    String ten, lop, gioitinh;
    int tuoi;
    double diem;

    public SinhVien() {
    }

    public SinhVien(String ten, String lop, String gioitinh, int tuoi, double diem) {
        this.ten = ten;
        this.lop = lop;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
