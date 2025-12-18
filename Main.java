public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.remove());
        System.out.println(queue.element());

        System.out.println(queue);
    }
}
