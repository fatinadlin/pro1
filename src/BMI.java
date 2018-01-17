/*anda dikehendaki membina satu program mengira BMI (Body Mass Index)
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.*;
public class BMI {
public static void main(String[] args){
    
    double bmi;
    String Ulasan;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan berat badan anda dalam ukuran kg: " );
    double berat=input.nextDouble();
    
      System.out.print("Masukkan berat badan anda dalam ukuran kg: " );
    double berat=input.nextDouble();
    
    System.out.print("Masukkan tinggi anda dalam ukuran cm :" );
    double tinggi=input.nextDouble();
    
    bmi=berat/(tinggi*tinggi);
    
    if (bmi < 18.5){
        Ulasan="kurang daripada yang sepatutnya";
        
    }else if (bmi < 25){
        Ulasan="normal";
        
    }else if (bmi < 30){
        Ulasan="berlebihan";
        
    }else{
        Ulasan="gemuk";
    }
    System.out.println("Anda mempunyai berat badan yang "+Ulasan );
   }
}
