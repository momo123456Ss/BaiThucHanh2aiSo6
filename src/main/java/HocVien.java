import java.util.Scanner;

public class HocVien {
    private String hoTen;
    private String ngaySinh;
    private String queQuan;
    private double diemToan;
    private double diemAnh;
    private double diemVan;
    private static int dem = 0;
    private int maHV;
    {
        dem++;
        this.maHV = dem;
    }
    public HocVien(String hoTen, String queQuan, String ngaySinh,double diemToan,double diemAnh,double diemVan){
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.diemAnh = diemAnh;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
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
    public void  hienThiDaNhapDiem(){
        System.out.println("Mã HV : " + this.maHV + "\nTên : "+this.hoTen + "\nQue Quán: "+this.queQuan +"\nNgay Sinh: "+this.ngaySinh + "\nDiem : " + (this.diemVan+this.diemToan+this.diemAnh)/3);
    }
    public void  hienThi(){
        System.out.println("Mã HV : " + this.maHV + "\nTên : "+this.hoTen + "\nQue Quán: "+this.queQuan +"\nNgay Sinh: "+this.ngaySinh);
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }
    public double nhapDiemToan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm toán: ");
        this.diemToan = sc.nextDouble();
        return this.diemToan;
    }
    public double nhapDiemAnh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm toán: ");
        this.diemAnh = sc.nextDouble();
        return this.diemAnh;
    }
    public double nhapDiemVan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm toán: ");
        this.diemVan = sc.nextDouble();
        return  this.diemVan;
    }
}
