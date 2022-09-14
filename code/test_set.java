@Test
public void test() throws Throwable {
	ArrayList list = new ArrayList();
	// Undeclared exception!
	try {
		int i = list.set(200, 200);
		fail("Exception IndexOutOfBoundsException");
	} catch(IndexOutOfBoundsException ex) {
		// Should be at least 0 and less than 0, found 200
	}
}