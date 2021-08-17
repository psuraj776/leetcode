public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            Integer[] a = new Integer[i];
            a[0] = 1;
            a[i-1] = 1;
            int j = 1;
            while(j<i-1){
                //System.out.println(i+" "+j);
                a[j] = res.get(i-2).get(j) + res.get(i-2).get(j-1);
                j++;
            }
            res.add(Arrays.asList(a));
        }
        return res;
    }