public class Main {
    static int mCount = 0;
        public Main(){
            mCount += 1;
        }
    public static void main(String[] args) {
        new Main();
        new Main();
        new Main();
        System.out.println("Frog count is now " + mCount);
    }
}