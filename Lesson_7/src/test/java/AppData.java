import java.io.*;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public static AppData load(File file){
        try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {
            int x;
            x = in.readInt();
            System.out.println(x);






        } catch (IOException e) {
            e.printStackTrace();
        }
//        AppData data = new AppData();
        return null;
    }



    public static void save(AppData data) {

    }
}
