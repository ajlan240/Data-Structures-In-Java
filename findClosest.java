package Tree;

public class findClosest {
    public static void main(String[] args) {
        findClosest tree = new findClosest();

        tree.insert(10);
        tree.insert(9);
        tree.insert(11);
        tree.insert(2);
        tree.insert(16);
        tree.insert(23);
        tree.insert(13);
        tree.insert(15);

        

        // tree.remove(16);

        // System.out.println(tree.contains(11));
        // System.out.println(tree.contains(16));

        // tree.inOrder();
        // System.out.println("\n");
        
        // tree.preOrder();
        // System.out.println("\n");
        
        // tree.postOrder();

        System.out.println(tree.findNearest(8));
        

        
    }

    Node root;
    
 
    // to set some data's into a tree
    public void insert(int data) {
        Node currentNode = root; 
        if (currentNode == null) {
            root = new Node(data);
            return;
        }

        while (true) {
            if (data < currentNode.data) {

                if (currentNode.left == null) {

                   currentNode.left = new Node(data);
                   break; 
                } else {
                    currentNode = currentNode.left;
                }
            } else {
                if (currentNode.right == null) {

                    currentNode.right = new Node(data);
                    break; 
                 } else {
                     currentNode = currentNode.right;
                 }

            }
        }


    }

    // to display the values of binarytree

    public void inOrder () {
        inOrderHelper(root);

    }

    public void inOrderHelper (Node node) {
        if (node != null) {

            inOrderHelper(node.left);
            System.out.print( node.data + " -> ");
            inOrderHelper(node.right);
        }
        
    }

    public void preOrder () {
        preOrderHelper(root);
        
    }
    public void preOrderHelper (Node node) {
        if (node != null) {

            System.out.print( node.data + " -> ");
            preOrderHelper(node.left);
            preOrderHelper(node.right);            
        }

    }

    public void postOrder () {
        postOrderHelper(root);
        
    }

    public void postOrderHelper (Node node) {
        if (node != null) {

            postOrderHelper(node.left);
            postOrderHelper(node.right);
            System.out.print( node.data + " -> ");            
        }
        
    }   
    // to serach an element
    public boolean contains(int data) {

        Node currentNode = root;
        while (currentNode != null) {
            if (data < currentNode.data) {
                currentNode = currentNode.left;
            } else if (data > currentNode.data) {
                currentNode = currentNode.right;
            } else {
                return true;
            }
            
        }
        return false;
    }

    // to remove a data from the binary tree

    public void remove(int data) {
        removeHelper(data, null, root);

    }
    private void removeHelper(int data, Node parentNode, Node currentNode) {
        while (currentNode != null) {
            if (data < currentNode.data) {
                parentNode = currentNode;
                currentNode = currentNode.left;
                
            } else if (data > currentNode.data) {
                parentNode = currentNode;
                currentNode = currentNode.right;
                
            } else {
                if (currentNode.left != null && currentNode.right != null) {
                    currentNode.data = getMinValue(currentNode.right);
                    removeHelper(currentNode.data, currentNode, currentNode.right);
                    
                } else {

                    if (parentNode == null) {

                        if (currentNode.right == null) {

                            root = currentNode.left;

                        } else {
                                root = currentNode.right;
                        }
                    } else {
                        if (parentNode.left == currentNode) {
                            if (currentNode.right == null) {
                                parentNode.right = currentNode.left;
                            } else  {
                                parentNode.left = currentNode.right;
                            }
                           
                        } else {
                            if (currentNode.right == null) {
                                parentNode.right = currentNode.left;
                            } else  {
                                parentNode.right = currentNode.right;
                            }                            
                        }
                    }
                }
                break;
            }
        }
    }
    public int getMinValue(Node currentNode) {

        if (currentNode.left == null) {

            return currentNode.data;
            
        } else {

            return getMinValue(currentNode.left);
        }
    }

    // to find Closest Value

    public int findNearest(int target) {
        Node current = root;
        int closest = current.data;

        while (current != null) {
            if (Math.abs(target - closest) > Math.abs(target - current.data)) {
                closest = current.data;
            }

            if (target < current.data) {
                current = current.left;
                
            } else if (target > current.data) {
                current = current.right;
            } else {
                break;
            }            
        }
        return closest;
    }

    static class Node {
        int data;
        Node left, right;

        public Node(int value) {
            this.data = value;
        }
    }
}
