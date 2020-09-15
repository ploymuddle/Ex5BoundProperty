/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5boundproperty;

import java.util.Scanner;

/**
 *
 * @author PLOYMUDDLE
 */
public class Ex5BoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPropertyBean mySource = new MyPropertyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        mySource.addPropertyChangeListener(listener1);
        mySource.addPropertyChangeListener(listener2);
        
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter Score ");
            String score = input.nextLine();
            if(score.equals("")){
                System.exit(0);
            }
            mySource.setScore(score);
        }
    }
    
}
