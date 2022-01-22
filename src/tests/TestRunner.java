package tests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 * @author Larry Maxwell - ljmaxwell1
 * CIS175 - Spring 2022
 * Jan 19, 2022
 */
public class TestRunner {
	public static void main(String[] args) {
		
		Result result =	JUnitCore.runClasses(TestStudentLogic.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
		}
}
