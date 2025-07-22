import java.util.HashMap;
import java.util.Map;

class FindSumPairs {
    int[] nums1;
    int[] nums2;
    private Map<Integer, Integer> m1; 
    private Map<Integer, Integer> m2; 
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        m1 = new HashMap<>();
        m2 = new HashMap<>();
        for (int num : nums1) {
            m1.put(num, m1.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            m2.put(num, m2.getOrDefault(num, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int oldVal = nums2[index];
        m2.put(oldVal, m2.get(oldVal) - 1);
        if (m2.get(oldVal) == 0) {
            m2.remove(oldVal);
        }
        nums2[index] += val;
        m2.put(nums2[index], m2.getOrDefault(nums2[index], 0) + 1);
    }
    public int count(int tot) {
        int c = 0;
        for (int key : m1.keySet()) {
            int complement = tot - key;
            if (m2.containsKey(complement)) {
                c += m1.get(key) * m2.get(complement);
            }
        }
        return c;
    }
}