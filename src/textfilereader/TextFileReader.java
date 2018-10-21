/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfilereader;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author Hildana
 */
public class TextFileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String fileName;
        fileName = JOptionPane.showInputDialog("Please enter a file name: ");
        BufferedReader readFile = new BufferedReader(new FileReader("c:/Comp_11/" + fileName));
        
        String line = "";

        
         while((line = readFile.readLine()) != null){//EOF (End Of File)
            System.out.println(line);
        }
        
    }
    
}
