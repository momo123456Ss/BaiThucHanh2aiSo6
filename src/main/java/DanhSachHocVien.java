import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachHocVien {
    private ArrayList<HocVien> hocVienCre = new ArrayList<>();
    private HocVien diemToan = null;
    private HocVien diemAnh = null;
    private HocVien diemVan = null;
    public void hienThiDanhSachHocVien(){
        File f = new File("src/main/resources/hocvien.txt");
        try(Scanner scanner = new Scanner(f)){
            while (scanner.hasNext()){
                String hoTen = scanner.nextLine();
                String queQuan = scanner.nextLine();
                String ngaySinh = scanner.nextLine();
                System.out.printf("Họ tên : %s\tQuê quán : %s\tNgày Sinh : %s  \n",hoTen,queQuan,ngaySinh);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void nhapDiemHocVien(){
        Scanner sc = new Scanner(System.in);
        File f = new File("src/main/resources/hocvien.txt");
        try(Scanner scanner = new Scanner(f)){
            while (scanner.hasNext()){
                String hoTen = scanner.nextLine();
                String queQuan = scanner.nextLine();
                String ngaySinh = scanner.nextLine();
//                layDiemToan();
//                layDiemVan();
//                layDiemAnh();
                HocVien hocVienCreate = new HocVien(hoTen,queQuan,ngaySinh,layDiemToan());
                hocVienCre.add(hocVienCreate);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        hocVienCre.forEach(fr->fr.hienThiDaNhapDiem());
    }
    public double layDiemToan(){
        return this.diemToan.nhapDiemToan();
    }
    public double layDiemVan(){
        return this.diemVan.nhapDiemVan();
    }
    public double layDiemAnh(){
        return this.diemAnh.nhapDiemAnh();
    }
}
