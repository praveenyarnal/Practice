package Com.TestAssignment.FB;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

import Com.Test.AssignmentImpl.ClassInvoker;
import Com.Test.Functions.GenericFunctions;
import Com.Test.Settings.Setup;

public class test extends Setup
{
	GenericFunctions gf=GenericFunctions.getInstance();
	@Test
	public void verify_FacebookPostComment(Method method) throws IOException, InterruptedException 
	{
		
		String TestCaseName=method.getName().toString();
		String strID=gf.getDataSetID(TestCaseName);
		ClassInvoker classInvoker=new ClassInvoker();
		classInvoker.LogintoFaceBook(driver,strID);
	}
	@Test
	public void verify_Add_ReviewComments(Method method) throws IOException, InterruptedException 
	{
		
		String TestCaseName=method.getName().toString();
		String strID=gf.getDataSetID(TestCaseName);
		ClassInvoker classInvoker=new ClassInvoker();
		classInvoker.verify_Add_ReviewComments(driver, strID);
	}


}
