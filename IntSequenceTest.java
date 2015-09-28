import junit.framework.TestCase;

public class IntSequenceTest extends TestCase {
	
   
	public void testtoString() {
		IntSequence a= new IntSequence(10);
		a.add(5);
		a.add(2);
		a.add(3);
		assertEquals(a.toString(), "5 2 3 0 0 0 0 0 0 0");
	}
	
	public void testAdd(){
		IntSequence a= new IntSequence(2);
		a.add(1);
		a.add(1);
		assertEquals(a.toString(), "1 1");
	}
	
	public void testInsert(){
		IntSequence a= new IntSequence(2);
		a.add(1);
		a.insert(2, 1);
		assertEquals(a.toString(), "1 2");
	}
	
	public void testisEmpty(){
		IntSequence a= new IntSequence(2);
		assertTrue(a.isEmpty());
		a.add(5);
		assertFalse(a.isEmpty());
	}
	
	public void testsize(){
		IntSequence a = new IntSequence(2);
		assertEquals(a.size(),0);
		a.add(5);
		assertEquals(a.size(), 1);
	}
	
	public void testelementAt(){
		IntSequence a = new IntSequence(2);
		a.insert(2, 1);
		assertEquals(a.elementAt(1),2);
	}
}
