package springtest;

/**
 * SpringTest_NetBeans
 * 
 * Test file for program.
 *
 * @author jrcro
 */

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class SpringTest_NetBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Resource resource=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    TestBean student=(TestBean)factory.getBean("testbean");  
    student.printAtt1();  
        
        
        
        
    }
    
}
