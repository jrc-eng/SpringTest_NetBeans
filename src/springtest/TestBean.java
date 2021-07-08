package springtest;

/**
 * TestBean
 * 
 * Test Bean File that contains a bean to use within Spring.
 * 
 * Bean Requirements for Spring:
 * * Default Constructor (None needed here, as we have no explicit constructors).
 * * Getters and Setters for all attributes (we only have one).
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
