class Solution {
    // class Person implements Comparable<Person> {
    //     String name;
    //     int height;

    //     Person(String n, int h) {
    //         this.name = n;
    //         this.height = h;
    //     }

    //     public int compareTo(Person P2) {
    //         return P2.height - this.height;
    //     }
    // }
    public String[] sortPeople(String[] names, int[] heights) {
       int n = names.length;
       Map<Integer, String> heightToNameMap = new HashMap<>();

       for(int i=0; i<n; i++) {
        heightToNameMap.put(heights[i], names[i]);
       }

       Arrays.sort(heights);

       String result[] = new String[n];

       for(int i=n-1; i>=0; i--) {
        result[n-i-1] = heightToNameMap.get(heights[i]);
       }

       return result;
    }
}