package Com.TestAssignment.FB;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunTestNG {

	public static void main(String[] args) {
		
		TestNG runner=new TestNG();
		List<String>suitefiles=new ArrayList<String>();
		File dir=new File("@/");
		String strdirPath=dir.getAbsolutePath().split("\\@")[0];
		String[] arrprojectName=strdirPath.split("\\\\");
		String strProjectName=arrprojectName[arrprojectName.length-1];
		String strSuitePath=strdirPath+"\\Suite.xml";
		suitefiles.add(strSuitePath);
		runner.setTestSuites(suitefiles);
		runner.run();
	}

}
