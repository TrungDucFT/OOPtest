package trungduc.quanlydanhba.controller;

import trungduc.quanlydanhba.lib.InputHelper;
import trungduc.quanlydanhba.lib.InterfaceContact;
import trungduc.quanlydanhba.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactController implements InterfaceContact {
    private List<Contact> danhSachContact;
    public ContactController(){
        danhSachContact = new ArrayList<>();
    }
    public void xemDanhBa(){
        for (Contact contact : danhSachContact){
            contact.inThongTin();
        }
    }
    public void themLienHe(Contact contact){
        danhSachContact.add(contact);
        System.out.println("Thêm liên hệ thành công");
    }
    public void thayDoiBlocked(int id){
        for (Contact contact : danhSachContact){
            if (contact.getiD() == id){
                if (contact.isBlocked()){
                    System.out.println("Trạng thái chặn: đã chặn");
                }else {
                    System.out.println("Trạng thái chặn: chưa chặn");
                }
                contact.setBlocked(!contact.isBlocked());
                System.out.println("Trạng thái chặn của liên hệ đã được cập nhập!");
            }
            else {
                System.out.println("ID "+id+" không tồn tại!");
            }
        }
    }

    @Override
    public void thayDoiTenLienHe(int id) {
        boolean found = false;
        for (Contact contact : danhSachContact){
            if (contact.getiD() == id){
                System.out.println("Tên liên hệ hiện tại: "+contact.getTenLienHe());
                String tenThayDoi = new InputHelper().readStringWithMaxLength("Nhập tên bạn muốn thay đổi",10);
                contact.setTenLienHe(tenThayDoi);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("ID "+id+" không tồn tại!");
        }
    }
    public void xoaLienHe(int id){
        for (Contact contact : danhSachContact){
            if (contact.getiD() == id){
                danhSachContact.remove(contact);
                break;
            }
        }
    }
    public void timKiemTheoID(int id){
        for (Contact contact : danhSachContact){
            if (contact.getiD() == id){
                contact.inThongTin();
            }else {
                System.out.println("ID "+id+"không tồn tại!");
            }
        }
    }
}
