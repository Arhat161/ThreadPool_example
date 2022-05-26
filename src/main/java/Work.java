public class Work implements Runnable {

    private int id; // thread id

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000); // no real work, just sleep some time
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Work " + id + " was completed"); // message after thread complete it's work
    }
}
