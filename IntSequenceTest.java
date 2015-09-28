import junit.framework.TestCase;

public class IntSequenceTest extends TestCase {
	
   
	public void testtoString() {
		IntSequence a= new IntSequence(10);
		a.add(5);
		a.add(2);
		a.add(3);
		assertEquals(a.toString(), "5 2 3");
	}
	
	public void testAdd(){
		IntSequence a= new IntSequence(2);
		a.add(1);
		a.add(1);
		assertEquals(a.toString(), "1 1");
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
	
	/**public void testelementAt(){
		IntSequence a = new IntSequence(2);
		a.insert(2, 1);
		assertEquals(a.elementAt(1),2);
	}**/
	
	public void testInsert(){
		IntSequence a= new IntSequence(3);
		a.add(1);
		a.insert(2, 1);
		assertEquals(a.toString(), "1 2");
		a.insert(3, 1);
		assertEquals(a.toString(), "1 3 2");
		//
	}
	
	public void testremove(){
		IntSequence a = new IntSequence(4);
		a.add(1);
		a.add(2);
		a.remove(1);
		assertEquals(a.toString(), "1");
		IntSequence b = new IntSequence(4);
		b.add(1);
		b.add(2);
		b.remove(0);
		assertEquals(b.toString(), "2");
	}
	
	public void testContains(){
		IntSequence a = new IntSequence(4);
		a.add(1);
		a.add(2);
		a.add(3);
		assertFalse(a.contains(4));
		assertTrue(a.contains(3));
	}
}
