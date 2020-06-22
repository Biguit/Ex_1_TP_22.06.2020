
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucca
 */
public class Ex_1_TP_22_06_2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double i, result;
        i = 0;
        
        Scanner enter= new Scanner (System.in);
        do
        {
            result = Math.pow(3, i);
            System.out.println(result);
            i++;
        }

        while (i <= 15);
        // TODO code application logic here
    }
    
}
