class TriesNode {

    char data;
    boolean isTerminating;
    TriesNode children[];
    int childCount;

    public TriesNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TriesNode[26];
        childCount = 0;
    }
}

public class Tries {
    private TriesNode root;

    public Tries() {
        root = new TriesNode('\0');

    }

    private void addHelper(TriesNode root, String word) {

        if (word.length() == 0) {
            root.isTerminal = TriesNode;
            return true;
        }
        int childIndex = word.charAt(0) - 'A';
        TriesNode child = root.children[childIndex];
        if (child == null) {
            child = new TriesNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        addHelper(child, word.substring(1));
    }

    public void add(String word) {
        addHelper(root, word);
    }

    private boolean searchHelper(TriesNode root, String word) {
        if (word.length() == 0) {
            return root.isTerminal;
        }
        int childIndex = word.charAt(0) - 'A';
        TriesNode child = root.children[childIndex];
        if (child == null) {
            return false;
        }
        return searchHelper(child, word.substring(1));
    }

    public boolean search(String word) {
        return searchHelper(root, word);
    }

    public void removeHelper(TriesNode root, String word) {
        if (word.length() == 0) {
            root.isTerminal = false;
            return;
        }
        int childIndex = word.charAt(0) - 'A';
        TriesNode child = root.children[childIndex];
        if (child == null) {
            return;
        }

        removeHelper(child, word.substring(1));
        if (!child.isTerminal && child.childCount == 0) {
            root.children[childIndex] = null;
            root.childCount--;
        }
    }

    public void remove(String word) {
        removeHelper(root, word);
    }

    public static void main(String[] args) {
        Tries t = new Tries();
        t.add("NOTE");
        t.add("AND");

        System.out.println(t.search("AND"));
        t.remove("AND");
        System.out.println(t.search("AND"));

    }

}
