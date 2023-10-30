/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.bagas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ACER
 */
public class TI_RegPagi_22205012_Latihan26 {
     public static void main(String[] args){
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
}
