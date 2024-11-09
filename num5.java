/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class num5 {
   public class DetallesCompaneros {
    public static void main(String[] args) {
        String[][] companeros = {
            {"Diana", "Selva", "Sistemas", "ING"},
            {"Mirna", "Chirinos", "Computación", "ING"},
            {"Arnol", "Aguilar", "Electronica", "ING"},
            {"Carlos", "Portillo", "Sistemas", "ING"},
            {"Rut", "Bautista", "Industrial", "ING"}
        };
        
        for (int i = 0; i < companeros.length; i++) {
            System.out.println(companeros[i][0] + " " + companeros[i][1] + " " + companeros[i][2] + " " + companeros[i][3]);
        }
    }
}
 
}
