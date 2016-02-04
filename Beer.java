/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beer;

/**
 *
 * @author Inspiron
 */
public class Beer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s=" ";
for(int x=99; x>0; x--)
{
System.out.println(x+" bottles of beer on the wall, "+x+" bottles of beer");
System.out.println("Take one down, pass it around, "+(x-1)+" bottles of beer on the wall \n");
}
System.out.print("Go to the store, buy some more, ");
System.out.println("99 bottles of beer on the wall.\n");
System.exit(0);
} 
    }
    

