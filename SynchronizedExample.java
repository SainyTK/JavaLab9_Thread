/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronizedexample;

/**
 *
 * @author 5835512048
 */
public class SynchronizedExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TwoStrings ts = new TwoStrings();
        
        new PrintStringsThread("Hello ", "there.",ts);
        new PrintStringsThread("How are ", "you?",ts);
        new PrintStringsThread("Thank you ", "very much!",ts);
    
    }
    
}
