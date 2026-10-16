import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleLogger {
    public static String createLog(int i) {
        return "[INFO] Test mesaji nomre " + i + "\n";
    }

    public static void writePlain(int count) {
        try (FileOutputStream file = new FileOutputStream("logs_plain.txt")) {
            for (int i = 1; i <= count; i++) {
                String log = createLog(i);
                file.write(log.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeBuffered(int count) {
        try (BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream("logs_buffered.txt"))) {
            for (int i = 1; i <= count; i++) {
                String log = createLog(i);
                bos.write(log.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}