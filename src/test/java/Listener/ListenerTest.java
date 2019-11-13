package Listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.CustomListener.class)
public class ListenerTest {
    @Test
    void Test1(){
        System.out.println("Tis is test1");
        Assert.assertEquals("A","A");
    }
    @Test
    void Test2(){
        System.out.println("This is test2");
        Assert.assertEquals("A","B");
    }
    @Test
    void Test3(){
        System.out.println("This is test3");
        throw new SkipException("This is skip Exception.......");
    }
}
