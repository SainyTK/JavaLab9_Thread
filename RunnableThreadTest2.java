/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5835512048
 */
public class RunnableThreadTest2 
{
    
    public static void main(String[] args)
    {
        new PrintNameRunnable("A");
        
        new PrintNameRunnable("B");
        new PrintNameRunnable("C");
    }
    
}
