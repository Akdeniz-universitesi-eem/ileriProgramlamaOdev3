package Homework3;

import javax.swing.JOptionPane;

import Homework3.methodsForHomework3.utilityClass;

public class question5 {
    public static void main(String[] args) {
       
        

    String number = JOptionPane.showInputDialog(null, args, "Guess the Number =", JOptionPane.INFORMATION_MESSAGE);
    int no =Integer.parseInt(number);
    if(isXPrime(no)==false){
        System.out.println("It has returned as 'false' ");
    }
    else{
        System.out.println("It has returned as 'true' ");
    }

    }

    public static Boolean isXPrime(int i){

        int c =0;
        
        for(int b = utilityClass.digitNumberSum(i);b>=2; b = utilityClass.digitNumberSum(i)){ // değerin basamakları toplamı 2  veya 2'den büyük olması durumunda
            if(utilityClass.prime(i)=="Prime"){    // asal mı diye kontrol et. Asal ise, digitnumber ile yine basamaklarını topla ve yukarı dön
                System.out.println(i);
                int y = utilityClass.digitNumberSum(i);
                i=y;
                if(i==2 || i==3 || i==5|| i==7){
                    System.out.println(i);
                    i=0;
                }                     
            }
            else{ //  değişen sayılar asal değilse c ye 1 ekle
                System.out.println(i);   
                c++;
                i=1;
            }
                       

        }
            if(c!=0){   // ilk döngüden çıkınca c değerine  göre return et
            return false;
            }
            else{
            return true;
            }        


        
    }
    
}
