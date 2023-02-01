int maxlength(int[]A,int n){
	HashMap<Integer,Integer> hm=new HashMap<>();
	int sum=0;
	int max=0;
	for(int i=0;i<n;i++){
		sum=sum+A[i];
		if(sum==0){
			max=i+1;
		}
		else if(hm.get(sum)!=null){
			max=Math.max(max,i-hm.get(sum));
		}
		else{
			hm.put(sum,i);
		}
	}
	return max;
}