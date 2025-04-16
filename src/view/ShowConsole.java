package view;

import java.util.Scanner;

public class ShowConsole {
 private Scanner scaner ;

    public ShowConsole() {
        this.scaner = new Scanner(System.in);
        showBanner();
    }
    public void showBanner() {
        System.out.println("--- METODOS DE BUSQUEDA ---");
    }
    public int inputCode() {
        System.out.print("Ingrese el codigo de la persona: ");
        int code = scaner.nextInt();
        return code;
    }
    public void showMessage(String message) {
        System.out.println(message);
    }
}
