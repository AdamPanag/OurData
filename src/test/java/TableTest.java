import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * JUnit test for the methods idExists and findMaxIdLength of the class Table.
 * 
 * @authors Hello_World team
 */
public class TableTest {
	
	private int pos = 0;
	private int missingPos = 1;
	private ArrayList<String> id = new ArrayList<String>();
	private Table myTable = new Table();
	
	@Before
	public void setUp() {
		id.add("1");
	}
	
	@Test
	public void testIdExists() {
		Assert.assertTrue("failure", myTable.idExists(pos,id));
		Assert.assertFalse("failure", myTable.idExists(missingPos,id));
	}
	
	@Test
	public void testFindMaxIdLength() {
		Assert.assertEquals("failure", myTable.findMaxIdLength(id), 1);
		id.add("2");
		Assert.assertEquals("failure", myTable.findMaxIdLength(id), 1);
	}
}
