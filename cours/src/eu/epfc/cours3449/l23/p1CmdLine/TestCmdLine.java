
package eu.epfc.cours3449.l23.p1CmdLine;

/**
 *
 * @author jedepaepe
 */
public class TestCmdLine {
    
    public static void main(String[] args) {
        System.out.println("Start applic");
        for (String string : args) {
            System.out.println(string);
        }
        System.out.println("Stop applic");
    }
    
}
