package java_trn.exercise;

public class StackInWebBrowsers {

    private class Node {
        String data;
        Node next;
        Node prev;
        Node(String data) {
            this.data = data;
        }
    }

    private Node current; // points to the current page

    // Check if the history is empty
    public boolean isEmpty() {
        return current == null;
    }

    // Visit a new URL (clear all forward history)
    public void visit(String url) {
        Node newNode = new Node(url);
        if (current != null) {
            // Disconnect the forward history
            current.next = null;
            newNode.prev = current;
            current.next = newNode;
        }
        current = newNode;
        System.out.println("Visited: " + current.data);
    }

    // Go back to the previous page
    public void back() {
        if (current == null || current.prev == null) {
            System.out.println("No previous page to go back to.");
            return;
        }
        current = current.prev;
        System.out.println("Back to: " + current.data);
    }

    // Go forward to the next page
    public void forward() {
        if (current == null || current.next == null) {
            System.out.println("No forward page to go to.");
            return;
        }
        current = current.next;
        System.out.println("Forward to: " + current.data);
    }

    // Show the current page
    public void currentPage() {
        if (current != null) {
            System.out.println("Current page: " + current.data);
        } else {
            System.out.println("No page visited yet.");
        }
    }
}


