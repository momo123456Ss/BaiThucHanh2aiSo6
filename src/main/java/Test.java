import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException, IOException {
        File f = new File("src/main/resources/hocvien.txt");
        ArrayList<HocVien> hocVien = new ArrayList<HocVien>();
        try(Scanner scanner = new Scanner(f)){
            while (scanner.hasNext()){

                String hoTen = scanner.nextLine();
                String queQuan = scanner.nextLine();
                String ngaySinh = scanner.nextLine();
                HocVien hocVienCreate = new HocVien(hoTen,queQuan,ngaySinh);
                hocVien.add(hocVienCreate);
            }
        }
        hocVien.forEach(fr->fr.hienThi());
    }
}
