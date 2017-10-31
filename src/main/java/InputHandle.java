import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by mff on 2017/10/31.
 */
public class InputHandle {
    ///Users/mff/Desktop/log.txt
    //@para path:读取文件的路径
    public static void  readInputFileByStream(String path) throws IOException{
        FileInputStream in = null;
        try {
         in  = new FileInputStream(path);
            int b = 0;
            while (true) {
                b = in.read();
                if (b == -1) {
                    break;
                }
                System.out.println(b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (in!=null){
                    in.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void  readFile(String path) throws IOException{
        FileReader reader = null;
        try {
            reader  = new FileReader(path);
            int ch = 0;
            while ((ch = reader.read()) !=-1) {
               System.out.println((char)ch);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (reader!=null){
                    reader.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
