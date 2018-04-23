/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5835512048
 */
public class ExtendThreadClassTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


            PrintNameThread pnt1 =
                    new PrintNameThread("A");


            PrintNameThread pnt2 =
                    new PrintNameThread("B");


            PrintNameThread pnt3 =
                    new PrintNameThread("C");

            PrintNameThread pnt4 =
                    new PrintNameThread("MyOwn");
    }
    
}
