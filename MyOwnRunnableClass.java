/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5835512048
 */
public class MyOwnRunnableClass implements Runnable
{
    private String name;
    
    public MyOwnRunnableClass(String name)
    {
        this.name = name;
    }
    
    public void run()
    {
        System.out.println("Thread " + this.name + " start running");
        
        for(int i=1;i<=10;i++)
            System.out.print(i+ " ");
    }
}
