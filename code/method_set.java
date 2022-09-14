class ArrayList {
	void set(int index, int element) {
		// validate the index
		checkRange(index);
		
		// set the element
		int old = data[index];
		data[index] = element
		return old;
		}
}