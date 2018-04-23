
import SimpleThread.SimpleThread;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5835512048
 */
public class DisplayAllThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new SimpleThread("Boston").start();
        new SimpleThread("New York").start();
        new SimpleThread("Seoul").start();
        new SimpleThread("Bangkok").start();
        
        Thread[] tarray = findAllThreads();
        
        for (int i=0; i<tarray.length;i++){
            System.out.println("Thread " + tarray[i].getName()
            + " in thread group " + tarray[i].getThreadGroup().getName());
        }
    }
    public static Thread[] findAllThreads() {
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        
        ThreadGroup topGroup = group;
        
        while (group != null) {
            topGroup = group;
            group = group.getParent();
        }
        
        int estimatedSize = topGroup.activeCount() * 2;
        Thread[] slackList = new Thread[estimatedSize];
        
        int actualSize = topGroup.enumerate(slackList);
        
        Thread[] list = new Thread[actualSize];
        System.arraycopy(slackList, 0, list, 0, actualSize);
        
        return list;
    }
    
}
