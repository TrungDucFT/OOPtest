import trungduc.quanlydanhba.controller.ContactController;
import trungduc.quanlydanhba.view.ContactView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactController contactController = new ContactController();
        ContactView view = new ContactView(contactController);
        Scanner scanner = new Scanner(System.in);
        char luaChon;
        do {
            view.hienThiMenu();
            System.out.println("Chọn tùy chọn (1/2/3/4/5/6/7): ");
            luaChon = scanner.next().charAt(0);
            view.thucThi(luaChon);
        }while (luaChon != '7');
    }
}