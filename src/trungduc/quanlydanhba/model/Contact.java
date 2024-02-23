package trungduc.quanlydanhba.model;

import trungduc.quanlydanhba.lib.InputHelper;

public class Contact {
    private int iD;
    private String tenLienHe;
    private int soDienThoai;
    private boolean blocked;

    public Contact(){
        this.iD = new InputHelper().readInt("Nhập ID: ","ID là số nguyên!");
        this.tenLienHe = new InputHelper().readStringWithMaxLength("Nhập tên của người trong danh bạ: ",10);
        this.soDienThoai = new InputHelper().readInt("Nhập số điện thọai: ","Số điện thoại là số nguyên!");
        this.blocked = false;
    }
    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getTenLienHe() {
        return tenLienHe;
    }

    public void setTenLienHe(String tenLienHe) {
        this.tenLienHe = tenLienHe;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
    public void inThongTin(){
        System.out.println("ID: "+iD);
        System.out.println("Tên liên hệ: "+tenLienHe);
        System.out.println("Số điện thoại: 0"+soDienThoai);
        if (isBlocked()){
            System.out.println("Trạng thái chặn: đã chặn");
        }else {
            System.out.println("Trạng thái chặn: chưa chặn");
        }
    }
}
