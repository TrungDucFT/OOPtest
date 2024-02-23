package trungduc.quanlydanhba.view;

import trungduc.quanlydanhba.controller.ContactController;
import trungduc.quanlydanhba.lib.InputHelper;
import trungduc.quanlydanhba.model.Contact;

import java.util.Scanner;

public class ContactView {
    private ContactController contactController;
    public ContactView(ContactController contactController){
        this.contactController = contactController;
    }
    public void hienThiMenu(){
        System.out.println("---------------------");
        System.out.println("   QUẢN LÝ DANH BẠ   ");
        System.out.println("---------------------");
        System.out.println("1. Xem danh bạ");
        System.out.println("2. Thêm liên hệ");
        System.out.println("3. Thay đổi trạng thái chặn");
        System.out.println("4. Đổi tên liên hệ");
        System.out.println("5. Xóa liên hệ");
        System.out.println("6. Tìm kiếm theo ID");
        System.out.println("7. Thoát");
    }
    public void thucThi(char luaChon){
        switch (luaChon){
            case '1':
                contactController.xemDanhBa();
                break;
            case '2':
                Contact contact = new Contact();
                contactController.themLienHe(contact);
                break;
            case '3':
                int idThayDoiBlocked = new InputHelper().readInt("Nhập ID bạn muốn thay đổi trạng thái chặn: ","ID là số nguyên dương!");
                contactController.thayDoiBlocked(idThayDoiBlocked);
                break;
            case '4':
                int idThayDoiTen= new InputHelper().readInt("Nhập ID bạn muốn thay đổi tên liên hệ: ","ID là số nguyên dương!");
                contactController.thayDoiTenLienHe(idThayDoiTen);
                break;
            case '5':
                int idXoaLienHe = new InputHelper().readInt("Nhập ID bạn muốn xóa liên hệ: ","ID là số nguyên dương!");
                contactController.xoaLienHe(idXoaLienHe);
                break;
            case '6':
                int idTimKiemThongTin = new InputHelper().readInt("Nhập ID bạn muốn tìm kiếm thông tin: ","ID là số nguyên dương!");
                contactController.timKiemTheoID(idTimKiemThongTin);
                break;
            case '7':
                System.out.println("Thoát chương trình thành công!");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại từ (1-7).");
        }
    }
}
