/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5835512048
 */
public class PrintNameThread extends Thread {
    
    PrintNameThread(String name) {
        super(name);
        // start() method is inside the constructor of the subclass
        start();
    }
    
    public void run() {
        String name = getName();
        for (int i = 0; i < 10; i++) {
            System.out.print(name);
        }
    }
}
