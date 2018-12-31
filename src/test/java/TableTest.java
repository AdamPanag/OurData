import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;



public class TableTest {
	
	private int pos = 0;
	private ArrayList<String> id = new ArrayList<String>();
	private Table myTable = new Table();
	
	@Before
	public void setUp() {
		id.add("1");
	}
	
	@Test
	public void testIdExists() {
		Assert.assertTrue("failure", myTable.idExists(pos,id));
	}

}
