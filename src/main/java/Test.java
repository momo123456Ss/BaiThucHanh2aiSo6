import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException, IOException {
////        Date d = new Date();
////        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
////        d = f.parse("07/05/2002");
////        System.out.println(f.format(d));
//        File f = new File("src/main/resources/hocvien.txt");
//        try(Scanner scanner = new Scanner(f)){
//            while (scanner.hasNext()){
//                String hoTen = scanner.nextLine();
//                String queQuan = scanner.nextLine();
//                String ngaySinh = scanner.nextLine();
//                System.out.println(hoTen + " " +queQuan + " " + ngaySinh);
//            }
//        }
//        File f2 = new File("src/main/resources/hocvien.txt");
//        FileWriter w2 = new FileWriter(f2,true);
//        try(PrintWriter w = new PrintWriter(w2)){
//            Scanner sc = new Scanner(System.in);
//            while (true) {
//                System.out.print("Nhập họ tên : ");
//                String hoTen = sc.nextLine();
//                System.out.print("Nhập quê quán : ");
//                String queQuan = sc.nextLine();
//                System.out.print("Nhập ngày sinh: ");
//                String ngaySinh = sc.nextLine();
//                System.out.print("Nhập tiếp 1 - 0");
//                int tiepTuc = sc.nextInt();
//                if (tiepTuc == 1) {
//                    w.println("\n" + hoTen);
//                    w.println(queQuan);
//                    w.println(ngaySinh);
//                    continue;
//                }
//                else {
//                    w.println("\n" + hoTen);w.println(queQuan);w.println(ngaySinh);
//                    break;
//                }
//
//            }
//        }
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
