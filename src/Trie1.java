public class Trie1 {
    class Node{
        Node children[];
        boolean isEnd;
        Node(){ // it will run when object will be made
            children=new Node[26];
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
            isEnd=false;
        }
    }
    Node root=new Node();
    void insert(String word){
      Node cur=root;
      for(int i=0;i<word.length();i++){
          char ch=word.charAt(i);
          int idx=ch-97;
          if(cur.children[idx]==null){
              cur.children[idx]=new Node(); // adress means object means not null
          }
          if(word.length()-1==i)    cur.children[idx].isEnd=true;
          cur=cur.children[idx];
      }
    }
    boolean search (String word){
        Node cur=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int idx=ch-97;
            if(cur.children[idx]==null){
               return false; // adress means object means not null
            }
            if(word.length()-1==i && cur.children[idx].isEnd) {
               return true;
            }
            cur=cur.children[idx];
        }
        return false;
    }
    public static void main(String[] args) {
      Trie1 obj=new Trie1();
      String arr[]={"apple","app","apple","apply","the","an","ghannath"};
      for(int i=0;i<arr.length;i++){
          obj.insert(arr[i]);
      }
        System.out.println(obj.search("app"));
        System.out.println(obj.search("apple"));
        System.out.println(obj.search("apply"));
        System.out.println(obj.search("appu"));
        System.out.println(obj.search("apu"));
        System.out.println(obj.search("ghannath"));
        System.out.println(obj.search("ghann"));
    }
}
