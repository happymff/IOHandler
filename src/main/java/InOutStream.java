import sun.jvm.hotspot.oops.OopUtilities;

import java.io.*;

/**
 * Created by mff on 2017/10/31.
 * 文件的copy功能
 */
public class InOutStream {

    public static void inAndOutStream(String inPath, String outPath) {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(inPath);
            out = new FileOutputStream(outPath);
            //设置字节流的缓冲区
            byte[] buff = new byte[1024];
            int len;
            long begintime = System.currentTimeMillis();
            while ((len= in.read(buff))!=-1){
                out.write(len);
            }
            long endtime = System.currentTimeMillis();
            System.out.println("拷贝文件花费的时间是："+(endtime-begintime)+"毫秒");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if (in!=null){
                    in.close();
                }
                if (out!=null){
                    out.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void readAndWriteFile(String inPath, String outPath) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            FileReader reader = new FileReader(inPath);
            br = new BufferedReader(reader);
            FileWriter writer = new FileWriter(outPath);
            bw= new BufferedWriter(writer);
            String str;
            long begintime = System.currentTimeMillis();
            while ((str= br.readLine())!=null){
               bw.write(str);
               bw.newLine();
            }
            long endtime = System.currentTimeMillis();
            System.out.println("拷贝文件花费的时间是："+(endtime-begintime)+"毫秒");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if (br!=null){
                    br.close();
                }
                if (bw!=null){
                    bw.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
