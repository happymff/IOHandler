import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by mff on 2017/10/31.
 */
public class OutputHandle {
    ///Users/mff/Desktop/log.txt
    //@param path：要存储用到的路径
    //@param b:是否追加
    public static void writeOutputFileByStream(String path, boolean b) {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(path, b);
            String str = "Hello world!你好中国";
            byte[] bytes = str.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                out.write(bytes[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeFile(String path, boolean b) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(path, b);
            String str = "Hello world!你好中国";
            writer.write(str);
            writer.write("\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
