class Solution {
    public int solution(int[] A) {
        int N = A.length;
        int[] uniques = new int[(N+1)/2];
        int[] sums = new int[(N+1)/2];
        
        uniques[0] = A[0];
        sums[0] = 1;
        int length = 1;
        
        for(int i = 1; i < N; i++) {
            boolean found = false;
            for(int j = 0; j < length; j++) {
                if(A[i] == uniques[j]) {
                    sums[j]++;
                    found = true;
                    break;
                }
            }
            
            if(!found) {
                uniques[length] = A[i];
                sums[length++] = 1;
            }
        }
        
        for(int i = 0; i < length; i++) {
            if(sums[i] % 2 != 0) {
                return uniques[i];
            }
        }
        return uniques[length-1];
    }
}