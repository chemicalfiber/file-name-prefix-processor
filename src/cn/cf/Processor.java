package cn.cf;

import cn.cf.util.FileReader;
import cn.cf.util.PrefixProcessor;

import java.util.Scanner;


public class Processor {
    public static void main(String[] args) {
        banner();
        // 要求用户输入路径
        System.out.println("请输入要处理文件名前缀的目录路径：\nPlease enter the directory path you want to process the file name prefix:");
        Scanner sc = new Scanner(System.in);
        String folderPath = sc.nextLine();
        FileReader.check(folderPath);
        System.out.println("即将处理【" + folderPath + "】下的文件...\nWe will process the files in the【" + folderPath + "】folder...");
        // 要求用户输入需要处理的前缀
        System.out.println("请输入你要删除的文件名前缀（Please enter the file name prefix that you want to delete）：");
        String prefix = sc.nextLine();
        System.out.println("要删除的文件名前缀是（The prefix of the file name you want to delete is）：" + prefix);
        // 询问用户是否是从Downie下载的
        System.out.println("上述文件是通过下列哪个下载器下载的？\nIf the above file(s) was downloaded via a downloader, please indicate which downloader you used.");
        System.out.println(
                "【1】Downie\t\t"+"【n】我没有使用下载器（I did not use any downloader）"
        );
        String choice = sc.nextLine();
        switch (choice){
            case "1":
                PrefixProcessor.downiePrefixProcess(folderPath,prefix);
                break;
            case "n":
                PrefixProcessor.commonProcess(folderPath,prefix);
                break;
            default:
                System.out.println("不支持的操作！即将退出...\nUnsupported!Exiting...");
                System.exit(0);
        }
    }
    static void banner(){
        System.out.println(
            "███████╗  ██╗  ██╗       ███████╗                                               \n" +
            "██╔════╝  ██║  ██║       ██╔════╝                                               \n" +
            "█████╗    ██║  ██║       █████╗                                                 \n" +
            "██╔══╝    ██║  ██║       ██╔══╝                                                 \n" +
            "██║       ██║  ███████╗  ███████╗                                               \n" +
            "╚═╝       ╚═╝  ╚══════╝  ╚══════╝                                               \n"
        );
        relax();
        System.out.println(
            "███╗   ██╗   █████╗   ███╗   ███╗  ███████╗                                     \n" +
            "████╗  ██║  ██╔══██╗  ████╗ ████║  ██╔════╝                                     \n" +
            "██╔██╗ ██║  ███████║  ██╔████╔██║  █████╗                                       \n" +
            "██║╚██╗██║  ██╔══██║  ██║╚██╔╝██║  ██╔══╝                                       \n" +
            "██║ ╚████║  ██║  ██║  ██║ ╚═╝ ██║  ███████╗                                     \n" +
            "╚═╝  ╚═══╝  ╚═╝  ╚═╝  ╚═╝     ╚═╝  ╚══════╝                                     \n"
        );
        relax();
        System.out.println(
            "██████╗   ██████╗   ███████╗  ███████╗  ██╗  ██╗  ██╗                               \n" +
            "██╔══██╗  ██╔══██╗  ██╔════╝  ██╔════╝  ██║  ╚██╗██╔╝                               \n" +
            "██████╔╝  ██████╔╝  █████╗    █████╗    ██║   ╚███╔╝                                \n" +
            "██╔═══╝   ██╔══██╗  ██╔══╝    ██╔══╝    ██║   ██╔██╗                                \n" +
            "██║       ██║  ██║  ███████╗  ██║       ██║  ██╔╝ ██╗                               \n" +
            "╚═╝       ╚═╝  ╚═╝  ╚══════╝  ╚═╝       ╚═╝  ╚═╝  ╚═╝                               \n"
        );
        relax();
        System.out.println(
            "██████╗   ██████╗    ██████╗    ██████╗  ███████╗  ███████╗  ███████╗   ██████╗   ██████╗ \n" +
            "██╔══██╗  ██╔══██╗  ██╔═══██╗  ██╔════╝  ██╔════╝  ██╔════╝  ██╔════╝  ██╔═══██╗  ██╔══██╗\n" +
            "██████╔╝  ██████╔╝  ██║   ██║  ██║       █████╗    ███████╗  ███████╗  ██║   ██║  ██████╔╝\n" +
            "██╔═══╝   ██╔══██╗  ██║   ██║  ██║       ██╔══╝    ╚════██║  ╚════██║  ██║   ██║  ██╔══██╗\n" +
            "██║       ██║  ██║  ╚██████╔╝  ╚██████╗  ███████╗  ███████║  ███████║  ╚██████╔╝  ██║  ██║\n" +
            "╚═╝       ╚═╝  ╚═╝   ╚═════╝    ╚═════╝  ╚══════╝  ╚══════╝  ╚══════╝   ╚═════╝   ╚═╝  ╚═╝\n"
        );
    }
    static void relax(){
        try{
            Thread.sleep(300);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
