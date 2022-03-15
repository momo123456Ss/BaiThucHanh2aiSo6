public class HocVien {
    private String hoTen;
    private String ngaySinh;
    private String queQuan;
    private double diemTrungBinh;
    private static int dem = 0;
    private int maHV;
    {
        dem++;
        this.maHV = dem;
    }
    public HocVien(int maHV, String hoTen, String ngaySinh, String sinh, double diemTrungBinh){
        this.maHV = maHV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
}
