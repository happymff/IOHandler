import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by mff on 2017/10/31.
 */
public class FileHandle {
    //path 文件所在路径
    public static void  testFileMethods(String path){
        File file = new File(path);
        //获取文件的名称
        System.out.println(file.getName());
        //获取文件的相对路径
        System.out.println(file.getPath());
        //获取文件的绝对路径
        System.out.println(file.getAbsolutePath());
        //获取文件的父路径
        System.out.println(file.getParent());
        //判断文件是否可读?
        System.out.println(file.canRead());
        //判断文件是否可写
        System.out.println(file.canWrite());
        //判断是否是一个文件
        System.out.println(file.isFile());
        //判断是否是个目录
        System.out.println(file.isDirectory());
        //判断是否是一个绝对路径
        System.out.println(file.isAbsolute());
        //得到文件最后修改时间
        System.out.println(file.lastModified());
        //得到文件的大小
        System.out.println(file.length()+"bytes");
        //是否成功删除文件
        System.out.println(file.delete());
    }
    public static void  listAllFiles(String path){
        File file = new File(path);
        if (file.isDirectory()){
            String[] names = file.list();//获得目录下所有文件名
            for(String name : names){
                System.out.println(name);
            }
        }
    }
    public static void  listJavaFiles(String path){
        File file = new File(path);
        //创建过滤器
        FilenameFilter filter= new FilenameFilter() {
            public boolean accept(File dir, String name) {
                File currentFile = new File(dir,name);
                if (currentFile.isFile() && name.endsWith(".java")){
                    return true;
                }else {
                    return false;
                }
            }
        };
        if (file.exists()){
            String[] names = file.list(filter);//获得目录下所有文件名
            for(String name : names){
                System.out.println(name);
            }
        }
    }
    public static void  listAllDirAndFiles(File dir){
        File[] file = dir.listFiles();
        for (File file1:file){
            if (file1.isDirectory()){
                listAllDirAndFiles(file1);
            }
            System.out.println(file1.getAbsolutePath());
        }
    }
}
