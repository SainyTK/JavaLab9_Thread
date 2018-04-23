/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadgrouptest;

import SimpleThread.SimpleThread;

/**
 *
 * @author 5835512048
 */
public class ThreadGroupTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Start three threads first.  They should belong
        // to a same ThreadsGroup.
        new SimpleThread("Boston").start();
        new SimpleThread("New York").start();
        new SimpleThread("Seoul").start();
        new SimpleThread("Bankok").start();
        
        // Get ThreadGroup of the current thread and display
        // the number of active threads that belong to the
        // ThreadGroup.
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        System.out.println("Number of active threads in this thread group = " 
                            + group.activeCount());
        
        // Display the names of the threads in the current
        // ThreadGroup.
        Thread[] tarray = new Thread[10];
        int actualSize = group.enumerate(tarray);
        for (int i=0; i<actualSize;i++){
            System.out.println("Thread " + tarray[i].getName() 
                               + " in thread group " + group.getName());
        }
    }
    
}
