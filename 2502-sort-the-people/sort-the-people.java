class Solution {
    class Person implements Comparable<Person> {
        String name;
        int height;

        Person(String n, int h) {
            this.name = n;
            this.height = h;
        }

        public int compareTo(Person P2) {
            return P2.height - this.height;
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Person p[] = new Person[n];

        for(int i=0; i<n; i++) {
            p[i] = new Person(names[i], heights[i]);
        }

        Arrays.sort(p);
        String result[] = new String[n];

        for(int i=0; i<n; i++) {
            result[i] = p[i].name;
        }

        return result;
    }
}