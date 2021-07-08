/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtest;

/**
 *
 * @author jrcro
 */
public class TestBean {
    private int att1;
    
    public int getAtt1()
    {
        return att1;
    }
    public void setAtt1(int att1)
    {
        this.att1 = att1;
    }
    
    public void printAtt1()
    {
        System.out.println("" + att1);
    }
    
}
