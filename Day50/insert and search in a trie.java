

// User function Template foherehere
// User function Template for Java

/*
static final int ALPHABET_SIZE = 26;

    // trie node
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) children[i] = null;
        }
    };
*/
//Function to insert string into TRIE.
static void insert(TrieNode root, String key) 
{
    // Your code here
    for(int i = 0; i < key.length(); i++){
        char c = key.charAt(i);
        if(root.children[c-'a'] == null){
            root.children[c-'a'] = new TrieNode();
        }
        root = root.children[c-'a'];
    }
    root.isEndOfWord = true;
}

//Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key)
{
    // Your code here
    for(int i = 0; i < key.length(); i++){
        char c = key.charAt(i);
        if(root.children[c-'a'] == null){
            return false;
        }
        root = root.children[c-'a'];
    }
    return root.isEndOfWord;
}
