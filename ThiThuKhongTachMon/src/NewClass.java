/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer-Nitro5
 */
public class NewClass {
    public static void main(String[] args) {
        System.out.println(checkSo("1.5"));
    }
        static boolean checkSo(String text) {
        return text.matches("[-+]?[0-9]*\\.?[0-9]*");
    }
}
