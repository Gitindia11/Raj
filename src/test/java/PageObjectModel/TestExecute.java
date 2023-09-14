package PageObjectModel;

import org.testng.annotations.Test;

public class TestExecute extends Repository1 {
	
  @Test
  public void Verify() throws Exception {
	  
	Repository1.log();
	
	Thread.sleep(3000);
	
  }
}
