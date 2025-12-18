public class Main {

    public static void main(String[] args) {
        // Queue<Integer> queue = new LinkedList<>();

        // queue.add(0);
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);

        // System.out.println(queue.remove());
        // System.out.println(queue.element());

        // System.out.println(queue);

        Deque<Integer> deque = new LinkedList<>();

        deque.add(0);
        deque.addFirst(-1);
        deque.addLast(1);

        deque.offerFirst(-2);
        deque.offerLast(2);

        deque.addFirst(-3);
        deque.addLast(3);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque);
    }
}
