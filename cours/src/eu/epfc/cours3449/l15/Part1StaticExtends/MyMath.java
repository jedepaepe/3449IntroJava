/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.epfc.cours3449.l15.Part1StaticExtends;

/**
 *
 * @author jedepaepe
 */
public class MyMath {
    public double abs(double value) {
        if(value < 0) return -value;
        else return value;
    }
    
    public static double staticAbs(double value) {
        if(value < 0) return -value;
        else return value;        
    }
    
    public static void main(String[] args) {
        MyMath m = new MyMath();
        double result = m.abs(-5.78);
        System.out.println(result);
        
        double result2 = (new MyMath()).abs(-8.333);
        System.out.println(result2);
        
        System.out.println((new MyMath()).abs(-82317.1));
        
        double result3 = MyMath.staticAbs(-3.617);
        System.out.println(result3);
    }
}
