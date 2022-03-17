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
    public HocVien(String hoTen, String queQuan, String ngaySinh){
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
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
    public void  hienThi(){
        System.out.println("Mã HV : " + this.maHV + "\nTên : "+this.hoTen + "\nQue Quán: "+this.queQuan +"\nNgay Sinh: "+this.ngaySinh);
    }
}
