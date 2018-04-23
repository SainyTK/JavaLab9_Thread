/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5835512048
 */
public class RunnableThreadTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         PrintNameRunnable pnt1 = new PrintNameRunnable("A");
        Thread t1 = new Thread(pnt1);
        t1.start();
        
        PrintNameRunnable pnt2 = new PrintNameRunnable("B");
        Thread t2 = new Thread(pnt2);
        t2.start();
        
        PrintNameRunnable pnt3 = new PrintNameRunnable("C");
        Thread t3 = new Thread(pnt3);
        t3.start();
        
        MyOwnRunnableClass mrc = new MyOwnRunnableClass("MyOwn1");
        Thread t4 = new Thread(mrc);
        t4.start();
        
        MyOwnRunnableClass mrc2 = new MyOwnRunnableClass("MyOwn2");
        Thread t5 = new Thread(mrc2);
        t5.start();

    }
    
}
