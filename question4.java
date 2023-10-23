package Homework3;

public class question4 {
    public static void main(String[] args) {
        /*abc üç basamaklı bir sayıdır ve şu koşulları sağlamaktadır
         koşul 1- cba>abc
         koşul2 abc asal
         koşul3 cba asal
         koşul4 ab asal
         koşul5 bc asal
         koşul6 cb asal
         koşul7 ba asal

         bu koşulları sağlatan tüm abc satıları bul
         */

         for(int a=1;a<10;a++){
            for(int b=1;b<10;b++){
                for(int c=1;c<10;c++){
                     if(c*100 + 10*b + a > a*100 +b*10+c){
            if(prime(a*100 +b*10+c)== "Prime" && prime(c*100 + 10*b + a )== "Prime" ){
                if(prime(10*a+b)== "Prime"  && prime(10*b+c)== "Prime"  && prime(10*c+b)== "Prime"  && prime(10*b+a)== "Prime"){

                    System.out.println(a*100+b*10+c);
                }
            } 
        }
                }
            }
         }
       
         // bütün koşullar için if kullanıldı
          
    }
    
    
    private static String prime(int i) {  // Prime(i) : i asal ise "Prime" değerini verir
        int c=0;
        for(int m=2;m<i;m++){
            if(i==(i/m)*m){
                c++;
            }    
        }
        if(c==0){
            return "Prime"; 
        }
        else{
            return "Not Prime";
        }

          
    }
}
