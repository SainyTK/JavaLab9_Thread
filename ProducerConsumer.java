/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5835512048
 */
public class ProducerConsumer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CubbyHole c = new CubbyHole();
        
        Producer p1 = new Producer(c, 1);
        Consumer c1 = new Consumer(c, 1);

        p1.start();
        c1.start();
    }
    
}
