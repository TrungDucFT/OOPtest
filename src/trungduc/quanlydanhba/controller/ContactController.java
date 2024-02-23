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
        System.out.println("Thêm liên hệ thành công!");
    }
    public void thayDoiBlocked(int id){
        boolean check = false;
        for (Contact contact : danhSachContact){
            if (contact.getiD() == id){
                if (contact.isBlocked()){
                    System.out.println("Trạng thái chặn: đã chặn");
                }else {
                    System.out.println("Trạng thái chặn: chưa chặn");
                }
                contact.setBlocked(!contact.isBlocked());
                System.out.println("Trạng thái chặn đã được thay đổi!");
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("ID "+id+" không tồn tại");
        }
    }
    @Override
    public void thayDoiTenLienHe(int id){
        boolean check = false;
        for (Contact contact : danhSachContact){
            if (contact.getiD() == id){
                contact.setTenLienHe(new InputHelper().readStringWithMaxLength("Nhập tên liên hệ thay đổi: ",10));
                System.out.println("Thay đổi tên liên hệ thành công!");
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("ID "+id+" không tồn tại");
        }
    }
    public void xoaLienHe(int id){
        boolean check = false;
        for (Contact contact : danhSachContact){
            if (contact.getiD() == id){
                danhSachContact.remove(contact);
                System.out.println("Xóa liên hệ thành công!");
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("ID "+id+" không tồn tại");
        }
    }
    public void timKiemTheoID(int id){
        boolean check = false;
        for (Contact contact : danhSachContact){
            if (contact.getiD() == id){
                contact.inThongTin();
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("ID "+id+" không tồn tại");
        }
    }


}
