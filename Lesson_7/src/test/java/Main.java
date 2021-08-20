import java.io.*;

public class Main {
    public static void main(String[] args) {

//        try (InputStream in = new BufferedInputStream(new
//                FileInputStream("/Users/pjeffere/IdeaProjects/Lesson_7/src/test/java/text.txt"))) {
//            int x;
//            while ((x = in.read()) != -1) {
//                System.out.print((char)x);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try (DataOutputStream out = new DataOutputStream(new
                FileOutputStream("/Users/pjeffere/IdeaProjects/Lesson_7/src/test/java/text.txt"))) {
            out.writeInt(128);
            out.writeLong(128L);
        } catch (IOException e) {
            e.printStackTrace();
        }
        AppData.load(new File("/Users/pjeffere/IdeaProjects/Lesson_7/src/test/java/text.txt"));
    }
}
