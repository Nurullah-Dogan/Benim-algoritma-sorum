
import java.util.Scanner;
import java.util.*;


public class nothesaplama {

    
    public static void main(String[] args) {
              
       double hesap=0;
       double ortalama=0;
        Scanner bir = new Scanner(System.in);
        System.out.println("birinci ödev notunuzu giriniz=");
        int ödev1 = bir.nextInt();
        
        Scanner iki = new Scanner(System.in);
        System.out.println("ikinci ödev notunuzu giriniz=");
        int ödev2 = iki.nextInt();
        
        Scanner üç = new Scanner(System.in);
        System.out.println("üçüncü ödev notunuzu giriniz=");
        int ödev3= üç.nextInt();
        
        hesap=(ödev1*0.3)+(ödev2*0.4)+(ödev3*0.3);
        System.out.println("notunuz="+hesap);
         
        if(hesap>=0&&hesap<50)
        {
            for (int i = 0; ortalama<=50; i++) {
                
                ortalama=(hesap*0.4)+(i*0.6);
                if(ortalama>=50){
                    System.out.println("finalden geçmek için alacağınız not="+i);}
                
            }
        }
        else if(hesap>=50&&hesap<=100){
           System.out.println("finalden geçmek için 50 ve üzeri yeterli olacak");} 
        else
            {
            System.out.println("0-100 aralığında sayı giriniz..");}
        }
       
            
    }
    
}
