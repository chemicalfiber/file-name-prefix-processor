package cn.cf.util;

import java.io.File;

public class PrefixProcessor {
    // Downie处理
    public static void downiePrefixProcess(String folderPath, String prefix){
        File[] fileList = FileReader.readFiles(folderPath, prefix);
        /*
        for (File fs:fileList) {
            System.out.println(fs.getName());
        }
        */
        // 获取前缀长度
        int length = prefix.length();
        for (File file : fileList) {
            String originName = file.getName();
            // 建立新的文件名，因为Downie会添加「 - xxx - 」作为中间修饰，所以要往后多切割
            String newName = originName.substring(length + 9);
//            System.out.println(newName);
            file.renameTo(new File(folderPath + File.separator + newName));   // 别忘记添加「File.separator」，否则会将被处理的文件移动到上级目录，并在文件名中增加原来目录的名字作为前缀
        }
        done();
    }
    // 未指定，一般处理
    public static void commonProcess(String folderPath, String prefix){
        File[] fileList = FileReader.readFiles(folderPath, prefix);
        // 获取前缀长度
        int length = prefix.length();
        for (File file : fileList) {
            String originName = file.getName();
            // 建立新的文件名
            String newName = originName.substring(length);
            file.renameTo(new File(folderPath + File.separator + newName));
        }
        done();
    }
    static void done(){
        System.out.println(
            "██████╗  ██████╗ ███╗   ██╗███████╗    ██╗\n" +
            "██╔══██╗██╔═══██╗████╗  ██║██╔════╝    ██║\n" +
            "██║  ██║██║   ██║██╔██╗ ██║█████╗      ██║\n" +
            "██║  ██║██║   ██║██║╚██╗██║██╔══╝      ╚═╝\n" +
            "██████╔╝╚██████╔╝██║ ╚████║███████╗    ██╗\n" +
            "╚═════╝  ╚═════╝ ╚═╝  ╚═══╝╚══════╝    ╚═╝"
        );
    }
}
