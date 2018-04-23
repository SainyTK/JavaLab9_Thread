/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleThread;

import static java.lang.Thread.sleep;

/**
 *
 * @author 5835512048
 */
public class SimpleThread extends Thread{
    
    public SimpleThread(String str) {
        super(str);
    }
    
    public void run() {
        for (int i = 0; i < 5; i++) {
            // System.out.format("%d %s%n", i, getName());
            try {
                sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e) {}
        }
        System.out.format("DONE! %s%n", this.getName());
    }
}
