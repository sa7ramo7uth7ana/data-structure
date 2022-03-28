/**
 * Created by TGC on 20/03/2022.
 */
public class Lab4Q1 {
    public static void main(String[] args) {
        String[] g1 = {"a", "b", "c", "d", "e", "f"};
        LinkedQueue<String> cq = new LinkedQueue<>();
        for (int i = 0; i < g1.length; i++) {
            cq.enqueue(g1[i]);
        }
        while (cq.size() > 1) {
            for (int i = 0; i < 2; i++) {
                cq.rotate();
                System.out.println(cq.dequeue() + "is out");
            }
            System.out.println("is winner" + cq.dequeue());
        }
    }
}
