package exercise11;

public class LinkedStack {
    private Node topNode;

    public boolean isEmpty() {
        // Check if stack has no elements
        return topNode == null;
    }

    public void push(String data) {
      Node nextNode = new Node(data);
        if(isEmpty()){
          topNode = nextNode;
        } else {
          nextNode.setNextNode(topNode);
          topNode=nextNode;
        }
        // Push element to stack
    }

    public String pop() {
        // Pop element from stack
        if(isEmpty()) {
          return null;
        } else {
          String data = topNode.getData();
          topNode = topNode.getNextNode();
          return data;
        }
       
    }

    @Override
    public String toString() {
        return NodeUtils.createNodeTraversalString(topNode);
    }
}
