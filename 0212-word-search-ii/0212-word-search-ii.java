class Solution {
     private final List<String> results = new LinkedList<>();

    private WordsTrie wordsTrie;
    private Board board;

    public List<String> findWords(char[][] board, String[] words) {
        this.board = new Board(board);
        this.wordsTrie = new WordsTrie(words);

        for (int x = 0; x <= this.board.lastIndexX; x++) {
            for (int y = 0; y <= this.board.lastIndexY; y++) {
                step(x, y, wordsTrie.getRoot());
            }
        }
        return results.stream().toList();
    }

    private void step(int x, int y, TrieNode previousNode) {
        char character = board.get(x, y);
        TrieNode currentNode = previousNode.getNext(character);
        if (currentNode != null) {
            if (currentNode.word != null) {
                results.add(currentNode.word);
                wordsTrie.removeWord(currentNode.word);
            }
            if (currentNode.hasNext()) {
                board.setAsVisited(x, y);
                doNextStepIfValid(x - 1, y, currentNode);
                doNextStepIfValid(x + 1, y, currentNode);
                doNextStepIfValid(x, y - 1, currentNode);
                doNextStepIfValid(x, y + 1, currentNode);
                board.restoreValue(x, y, character); // restore original value
            }
        }
    }

    private void doNextStepIfValid(int x, int y, TrieNode previousNode) {
        if (board.isValid(x, y) && !board.wasAlreadyVisited(x, y)) {
            step(x, y, previousNode);
        }
    }

    class Board {
        char[][] board;
        public int lastIndexX;
        public int lastIndexY;
        private static final char ALREADY_VISITED_VALUE = '#';

        public Board(char[][] board) {
            this.board = board;
            this.lastIndexX = board.length  - 1;
            this.lastIndexY = board[0].length - 1;
        }

        public char get(int x, int y) {
            return board[x][y];
        }

        public void restoreValue(int x, int y, char value) {
            board[x][y] = value;
        }

        public boolean isValid(int x, int y) {
            return x >= 0 && x <= lastIndexX && y >= 0 && y <= lastIndexY;
        }
        
        public void setAsVisited(int x, int y) {
            board[x][y] = ALREADY_VISITED_VALUE;
        }

        public boolean wasAlreadyVisited(int x, int y) {
            return board[x][y] == ALREADY_VISITED_VALUE;
        }
    }

    class WordsTrie {
        private TrieNode root = new TrieNode();

        public WordsTrie(String[] words) {
            for (String word: words) {
                addWord(word);
            }
        }

        public TrieNode getRoot() {
            return root;
        }

        public void addWord(String word) {
            char[] wordCharacters = word.toCharArray();
            TrieNode node = root;
            for (char c : wordCharacters) {
                node = node.addNextNode(c);
            }
            node.markAsLastNode(word);
        }

        private void removeWord(String word) {
            TrieNode node = this.root;
            char[] wordCharacters = word.toCharArray();
            for (char c : wordCharacters) {
                TrieNode prevNode = node;
                node = node.getNext(c);
                node.numberOfWordsUsingThisNode--;
                if (node.numberOfWordsUsingThisNode == 0) {
                    prevNode.removeNext(c);
                }
            }
            node.removeLastNodeMarker();
        }
    }

    class TrieNode {
        private Map<Character, TrieNode> nextNodes = new HashMap<>();
        private String word = null;
        /**
         * Optimization:
         * - Every time we find the word connected with this node we decrease this counter.
         * - When the counter drops to zero then we remove the node
         * Effect: for the next words, we do not waste time traversing this node.
         */
        private int numberOfWordsUsingThisNode = 1;

        public TrieNode() {
        }

        public boolean hasNext() {
            return !nextNodes.isEmpty();
        }

        public TrieNode getNext(Character character) {
            return nextNodes.get(character);
        }

        public void removeNext(Character character) {
            nextNodes.remove(character);
        }

        public void markAsLastNode(String word) {
            this.word = word;
        }

        public void removeLastNodeMarker() {
            this.word = null;
        }

        public TrieNode addNextNode(Character character) {
            TrieNode node = nextNodes.get(character);
            if (node == null) {
                node = new TrieNode();
                nextNodes.put(character, node);
            } else {
                node.numberOfWordsUsingThisNode++;
            }
            return node;
        }
    }
}