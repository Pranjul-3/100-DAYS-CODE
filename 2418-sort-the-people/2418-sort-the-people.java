class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
            Pair[] combined = new Pair[names.length];
        for (int i = 0; i < names.length; i++) {
            combined[i] = new Pair(names[i], heights[i]);
        }
        
        // Sort the combined array based on heights in descending order
        Arrays.sort(combined, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                // Sort in descending order based on heights
                return Integer.compare(p2.height, p1.height);
            }
        });
        
        // Extract sorted names
        String[] sortedNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            sortedNames[i] = combined[i].name;
        }
        
        return sortedNames;
    }

    static class Pair {
        String name;
        int height;
        
        public Pair(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }
}