package Homework3;

import java.util.Random;

import javax.swing.JOptionPane;

public class question3 {

    public static void main(String[] args) {

        Random rand = new Random();

        int randNo1 = rand.nextInt(100);
        int for_try;
        for(for_try=0;for_try<1;){ // yanlış değerler veya eşit olmayan bir integer girince yeniden sorması için bir döngü
        String guess = JOptionPane.showInputDialog(null, "Guess", "The Number =",JOptionPane.QUESTION_MESSAGE);
         //showInputDialog(Component parentComponent, Object message, String title, int messageType) : String //JOptionPane.QUESTION_MESSAGE
        System.out.println(randNo1); // rastgele sayıyı teker teker aramak yerine direk yazınca, çıkan yazıyı görebilirsiniz
        
       try {
         

         int number = Integer.parseInt(guess);
         
        

       } catch ( NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "AND WRITE A COMPUTABLE VALUE!!!!", "PLEASE RUN AGAIN ",JOptionPane.OK_CANCEL_OPTION);
        for_try=0; // döngüyü catch koşulu için bulamadım
        } 
        
       int number = Integer.parseInt(guess);
       if (number < 0 || number>100){
        JOptionPane.showMessageDialog(null, null, "PLEASE WRITE A COMPUTABLE VALUE!!!!",JOptionPane.ERROR_MESSAGE);
       }
       
       if(number==randNo1){
        JOptionPane.showMessageDialog(null, null, "TRUE",JOptionPane. PLAIN_MESSAGE);
        for_try++;
       }
       else{
        JOptionPane.showMessageDialog(null, null, "TRY AGAIN",JOptionPane.YES_NO_CANCEL_OPTION);
        for_try=0;
       }
     }
    }
    
}
