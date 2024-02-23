package trungduc.quanlydanhba.lib;

import java.util.Scanner;

public class InputHelper {
    private Scanner scanner;
    public InputHelper(){
        this.scanner = new Scanner(System.in);
    }
    public int readInt(String prompt, String error){
        while (true){
            try {
                System.out.println(prompt);
                return Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println(error);
            }
        }
    }
    public String readStringWithMaxLength(String prompt, int maxLength){
        String intput;
        do{
            System.out.println(prompt+"(không quá "+maxLength+" ký tự): ");
            intput = new Scanner(System.in).nextLine().trim();
            if (intput.length()>maxLength){
                System.out.println("Chuỗi nhập vào quá dài. Vui lòng nhập lại");
            }
        }while (intput.length()>maxLength);
        return intput;
    }
}
