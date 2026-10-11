package PracticingArrays;

import java.util.*;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Pascal_Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal_Triangle
{
    public static void main(String args[]){
        int index=Integer.parseInt(
                JOptionPane.showInputDialog("Enter index or power?"));
        int  i,j;
        int[][] pascal=new int[index][];
        for (i=0;i<index;i++){
            pascal[i]=new int[i+1];
            pascal[i][0]=pascal[i][i]=1;
            for (j=1;j<i;j++){
                pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
            }
        }
        //print the matrix
        JFrame frame = new JFrame("Pascal's Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.insets = new Insets(5,5,5,5);
        
        //Create a separate JLabel for each value
        for(i = 0; i < index; i++){
            int startCol = index - i - 1;
            for(j = 0; j < pascal[i].length; j++){
                JLabel lbl = new JLabel(String.format("%7s",String.valueOf(pascal[i][j])));
                lbl.setFont(new Font("Arial", Font.BOLD, 18));
                
                gbc.gridx = startCol + (j * 2);
                gbc.gridy = i;
                
                panel.add(lbl, gbc);
            }
        }
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
