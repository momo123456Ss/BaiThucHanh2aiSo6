import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachHocVien {
    private ArrayList<HocVien> hocVienCre = new ArrayList<>();
    private HocVien diemToan;
    private HocVien diemAnh;
    private HocVien diemVan;
    public void hienThiDanhSachHocVien(){
        File f = new File("src/main/resources/hocvien.txt");
        try(Scanner scanner = new Scanner(f)){
            while (scanner.hasNext()){
                String hoTen = scanner.nextLine();
                String queQuan = scanner.nextLine();
                String ngaySinh = scanner.nextLine();
                HocVien hocVienCreate = new HocVien(hoTen,queQuan,ngaySinh);
                hocVienCre.add(hocVienCreate);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        hocVienCre.forEach(fr->fr.hienThi());
    }
    public void nhapDiemHocVien(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i<hocVienCre.size();i++){
            System.out.printf("Nhập điểm môn Toán của Học Viên thứ %d",i + 1);
            diemToan = sc.nextDouble();
        }
    }

    public HocVien getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(HocVien diemToan) {
        this.diemToan = diemToan;
    }

    public HocVien getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(HocVien diemAnh) {
        this.diemAnh = diemAnh;
    }

    public HocVien getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(HocVien diemVan) {
        this.diemVan = diemVan;
    }
}
