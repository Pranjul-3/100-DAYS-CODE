/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    private String s;

    public NestedInteger deserialize(String s) {
        this.s = s;
        return solve(1);
    }

    private NestedInteger solve(int method) {
        NestedInteger ni = null;
        switch(method) {
            case 1:
                ni = _1_deserialize(s);
                break;

            case 2:
                break;
        }
        return ni;
    }

    private NestedInteger _1_deserialize(String s) {
        Deque<NestedInteger> stack = new ArrayDeque<>();
        int sum = 0;
        boolean negative = false;
        NestedInteger answer = null;
        boolean first = true;
        for(int i = 0; i<s.length(); i++) {
            switch(s.charAt(i)) {
                case '1', '2', '3', '4', '5', '6', '7', '8','9','0':
                    sum = sum * 10 + s.charAt(i) - '0';
                    break;
                case '-':
                    negative = true;
                    break;
                case ',':
                    if(s.charAt(i-1) == ']') continue;
                    if(negative) sum = -sum;
                    if(!stack.isEmpty()) stack.peekLast().add(new NestedInteger(sum));
                    else return new NestedInteger(sum);
                    sum = 0;
                    negative = false;
                    break;
                case '[':
                    NestedInteger ni = new NestedInteger();
                    if(first) { answer = ni; first = false;}
                    if(!stack.isEmpty())stack.peekLast().add(ni);
                    stack.addLast(ni);
                    break;
                case ']':
                    if(Character.isDigit(s.charAt(i-1))) {
                        if(negative) sum = -sum;
                        if(!stack.isEmpty()) stack.peekLast().add(new NestedInteger(sum));
                        else return new NestedInteger(sum);
                        sum = 0;
                        negative = false;
                    }
                    stack.removeLast();
            }
        }
        if(first) answer = new NestedInteger(sum * (negative ? -1 : 1));
        return answer;
    }
}