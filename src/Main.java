public class Main {
    public static void main(String[] args) {
        int count = 100000;

        long start = System.nanoTime();
        SimpleLogger.writePlain(count);
        long end = System.nanoTime();
        System.out.println("FileOutputStream: " + (end - start) / 1000000 + " ms");

        start = System.nanoTime();
        SimpleLogger.writeBuffered(count);
        end = System.nanoTime();
        System.out.println("BufferedOutputStream: " + (end - start) / 1000000 + " ms");
    }
}