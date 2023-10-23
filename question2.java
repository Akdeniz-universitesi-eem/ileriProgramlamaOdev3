package Homework3;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class question2 {

    public static void main(String[] args) {
        /*2.--- */

 Random rand = new Random();

        
        int randNo1 = rand.nextInt(1000);

        int randNo2 = rand.nextInt(1000); // 0-1000 arasında rastegele sayı atayan rand komutu 
                    //0,1,2,3,4,5
        int[] roll1 = {1,2,3,4,5,6}; 
        int[] roll2 = {1,2,3,4,5,6}; // roll[0] = 1 , roll[1] = 2 .....,roll[5] = 6  (-roll[randNo]-)  
        ImageIcon icon11 = new ImageIcon("Homework3/jpgFiles/11.jpg");
        ImageIcon icon12 = new ImageIcon("Homework3/jpgFiles/12.jpg");
        ImageIcon icon13 = new ImageIcon("Homework3/jpgFiles/13.jpg");
        ImageIcon icon14 = new ImageIcon("Homework3/jpgFiles/14.jpg");
        ImageIcon icon15 = new ImageIcon("Homework3/jpgFiles/15.jpg");
        ImageIcon icon16 = new ImageIcon("Homework3/jpgFiles/16.jpg");
        ImageIcon icon21 = new ImageIcon("Homework3/jpgFiles/21.jpg");
        ImageIcon icon22 = new ImageIcon("Homework3/jpgFiles/22.jpg");
        ImageIcon icon23 = new ImageIcon("Homework3/jpgFiles/23.jpg");
        ImageIcon icon24 = new ImageIcon("Homework3/jpgFiles/24.jpg");
        ImageIcon icon25 = new ImageIcon("Homework3/jpgFiles/25.jpg");
        ImageIcon icon26 = new ImageIcon("Homework3/jpgFiles/26.jpg");
        ImageIcon icon31 = new ImageIcon("Homework3/jpgFiles/31.jpg");
        ImageIcon icon32 = new ImageIcon("Homework3/jpgFiles/32.jpg");
        ImageIcon icon33 = new ImageIcon("Homework3/jpgFiles/33.jpg");
        ImageIcon icon34 = new ImageIcon("Homework3/jpgFiles/34.jpg");
        ImageIcon icon35 = new ImageIcon("Homework3/jpgFiles/35.jpg");
        ImageIcon icon36 = new ImageIcon("Homework3/jpgFiles/36.jpg");
        ImageIcon icon41 = new ImageIcon("Homework3/jpgFiles/41.jpg");
        ImageIcon icon42 = new ImageIcon("Homework3/jpgFiles/42.jpg");
        ImageIcon icon43 = new ImageIcon("Homework3/jpgFiles/43.jpg");
        ImageIcon icon44 = new ImageIcon("Homework3/jpgFiles/44.jpg");
        ImageIcon icon45 = new ImageIcon("Homework3/jpgFiles/45.jpg");
        ImageIcon icon46 = new ImageIcon("Homework3/jpgFiles/46.jpg");
        ImageIcon icon51 = new ImageIcon("Homework3/jpgFiles/51.jpg");
        ImageIcon icon52 = new ImageIcon("Homework3/jpgFiles/52.jpg");
        ImageIcon icon53 = new ImageIcon("Homework3/jpgFiles/53.jpg");
        ImageIcon icon54 = new ImageIcon("Homework3/jpgFiles/54.jpg");
        ImageIcon icon55 = new ImageIcon("Homework3/jpgFiles/55.jpg");
        ImageIcon icon56 = new ImageIcon("Homework3/jpgFiles/56.jpg");
        ImageIcon icon61 = new ImageIcon("Homework3/jpgFiles/61.jpg");
        ImageIcon icon62 = new ImageIcon("Homework3/jpgFiles/62.jpg");
        ImageIcon icon63 = new ImageIcon("Homework3/jpgFiles/63.jpg");
        ImageIcon icon64 = new ImageIcon("Homework3/jpgFiles/64.jpg");
        ImageIcon icon65 = new ImageIcon("Homework3/jpgFiles/65.jpg");
        ImageIcon icon66 = new ImageIcon("Homework3/jpgFiles/66.jpg");

        System.out.print(roll1[randNo1%6]+" ");
        System.out.print(roll2[randNo2%6]+ " "); // çıkan sayılar ile zar değerleri karşılaştırmak için
        if(randNo1%6==0 && randNo2%6==0){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon11);
        }
        if(randNo1%6==0 && randNo2%6==1){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon12);
        }
        if(randNo1%6==0 && randNo2%6==2){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon13);
        }
        if(randNo1%6==0 && randNo2%6==3){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon14);
        }
        if(randNo1%6==0 && randNo2%6==4){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon15);
        }
        if(randNo1%6==0 && randNo2%6==5){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon16);
        }
        if(randNo1%6==1 && randNo2%6==0){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon21);
        }
        if(randNo1%6==1 && randNo2%6==1){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon22);
        }
        if(randNo1%6==1 && randNo2%6==2){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon23);
        }
        if(randNo1%6==1 && randNo2%6==3){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon24);
        }
        if(randNo1%6==1 && randNo2%6==4){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon25);
        }
        if(randNo1%6==1 && randNo2%6==5){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon26);
        }
        if(randNo1%6==2 && randNo2%6==0){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon31);
        }
        if(randNo1%6==2 && randNo2%6==1){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon32);
        }
        if(randNo1%6==2 && randNo2%6==2){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon33);
        }
        if(randNo1%6==2 && randNo2%6==3){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon34);
        }
        if(randNo1%6==2 && randNo2%6==4){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon35);
        }
        if(randNo1%6==2 && randNo2%6==5){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon36);
        }
        if(randNo1%6==3 && randNo2%6==0){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon41);
        }
        if(randNo1%6==3 && randNo2%6==1){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon42);
        }
        if(randNo1%6==3 && randNo2%6==2){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon43);
        }
        if(randNo1%6==3 && randNo2%6==3){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon44);
        }
        if(randNo1%6==3 && randNo2%6==4){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon45);
        }
        if(randNo1%6==3 && randNo2%6==5){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon46);
        }
        if(randNo1%6==4 && randNo2%6==0){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon51);
        }
        if(randNo1%6==4 && randNo2%6==1){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon52);
        }
        if(randNo1%6==4 && randNo2%6==2){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon53);
        }
        if(randNo1%6==4 && randNo2%6==3){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon54);
        }
        if(randNo1%6==4 && randNo2%6==4){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon55);
        }
        if(randNo1%6==4 && randNo2%6==5){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon56);
        }
        if(randNo1%6==5 && randNo2%6==0){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon61);
        }
        if(randNo1%6==5 && randNo2%6==1){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon62);
        }
        if(randNo1%6==5 && randNo2%6==2){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon63);
        }
        if(randNo1%6==5 && randNo2%6==3){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon64);
        }
        if(randNo1%6==5 && randNo2%6==4){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon65);
        }
        if(randNo1%6==5 && randNo2%6==5){
            JOptionPane.showMessageDialog(null,"","",JOptionPane.PLAIN_MESSAGE, icon66);
        }
       

        
        //showMessageDialog(Component parentComponent, Object message, String title, int messageType, Icon icon) : void

    }
    
}

        
    
    

