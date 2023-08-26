package TestNG;

import java.util.PriorityQueue;

import org.openqa.grid.internal.listeners.Prioritizer;
import org.testng.annotations.Test;

public class sample {
@Test
public void test() 
{
	System.out.println("hi");
}
@Test(priority = 3)
public void demo()
{
	System.out.println("hello");
}
@Test(priority = 4)
public void intiger()
{
	System.out.println("bye");
}
}
