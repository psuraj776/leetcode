    public List<Integer> targetIndices(int[] nums, int target) {
		int less = 0, dup = 0;
    	for (int i : nums)
    		if (i < target)
    			less++;
    		else if (i == target)
    			dup++;
    	List<Integer> res = new ArrayList<>(dup);
    	for (int i = 0; i < dup; i++)
    		res.add(less + i);
    	return res;
    }
