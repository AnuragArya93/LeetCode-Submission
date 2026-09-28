class Solution {
    public int[] findEvenNumbers(int[] digits) {
        

        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 100; i < 1000; i += 2) {
            int d1 = i / 100;
            int d2 = (i / 10) % 10;
            int d3 = i % 10;

            int[] currentFreq = new int[10];
            currentFreq[d1]++;
            currentFreq[d2]++;
            currentFreq[d3]++;

            if (freq[d1] >= currentFreq[d1] &&
                freq[d2] >= currentFreq[d2] &&
                freq[d3] >= currentFreq[d3]) {
                result.add(i);
            }
        }

        int[] resArray = new int[result.size()];
        for (int j = 0; j < result.size(); j++) {
            resArray[j] = result.get(j);
        }

        return resArray;
    

    }
}