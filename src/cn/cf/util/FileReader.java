package cn.cf.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;

public class FileReader {
    public static void check(String folderPath){
        File f = new File(folderPath);
        if (!f.exists()) {
            System.out.println("目录【" + folderPath + "】不存在！");
            System.out.println("Path【" + folderPath + "】does not exist!");
            System.exit(0);
        }
    }
    public static File[] readFiles(String folderPath, String prefix){
        File f = new File(folderPath);
        File[] filesInDirectory = f.listFiles();
        // 创建存放文件的列表
        ArrayList<File> fileListArray = new ArrayList<>();
        // 遍历并添加需要的文件到待处理列表
        for (File fs : Objects.requireNonNull(filesInDirectory)) {
            if (fs.isDirectory()) {
                System.out.println(fs.getName() + " （是目录，不支持重命名；Is a directory, doesn't support renaming ）");
            } else if (fs.getName().startsWith(prefix)) {
                System.out.println("找到文件（Found File）：" + fs.getName());
                fileListArray.add(fs);
            }
        }
        // 检查有没有指定前缀的文件
        if (fileListArray.size()==0){
            System.out.println("找不到文件名以【" + prefix +"】开头的文件！即将退出...");
            System.out.println("Cannot find the file whose name starts with 【" + prefix + "】, exiting...");
            System.exit(0);
        }
        File[] fileList = new File[fileListArray.size()];
        for (int i = 0; i < fileList.length; i++) {
            fileList[i] = fileListArray.get(i);
        }
        return fileList;
    }
}
