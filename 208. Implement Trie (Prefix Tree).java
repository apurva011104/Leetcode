class Trie {
    class Node{
        char ch;
        Map<Character,Node> child;
        Node(char ch){
            this.ch=ch;
            child=new HashMap<>();
        }
    }
    Node root;
    public Trie() {
        root=new Node(' ');
    }
    public void insert(String word) {
        Map<Character, Node> map=root.child;
        Node temp=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(map.containsKey(ch)){
                map=map.get(ch).child;
            }
            else{
                Node node=new Node(ch);
                map.put(ch,node);
                map=node.child;
            }
        }
        map.put(' ',new Node(' '));
    }
    
    public boolean search(String word) {
        Map<Character, Node> map=root.child;
         for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(!map.containsKey(ch))      return false;
            map=map.get(ch).child;
        }
        if(!map.containsKey(' '))       return false;
        return true;
    }
    
    public boolean startsWith(String prefix) {
        Map<Character, Node> map=root.child;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            if(!map.containsKey(ch))      return false;
            map=map.get(ch).child;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
