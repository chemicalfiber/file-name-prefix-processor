# 文件名前缀处理器——File Name Prefix Processor
> 用某些下载工具下载的文件名有一长串相同的前缀？一个一个重命名很麻烦？那你可以试试这款工具！

## 开始使用：
- 下载并安装JRE，JRE版本至少为8以上
- 下载Release中的JAR包，并妥善存放
- 将要处理前缀的文件统一放进一个文件夹中
- 通过操作系统终端进入JAR包的目录，输入下列命令启动本应用：
```bash
java -jar (你下载的JAR包的名字)
```
- 根据窗口中对应的提示操作即可

> 如果你是在Gitee看到这个项目，请你前往GitHub下载Release的Jar包<br>
> 因为我不想实名认证<br>
> Gitee, U ARE A PURE GIT！

> 当你想处理Downie下载的文件的文件名时请注意，你只需要复制重复的前缀部分！
> 
> 即：源文件名为「xxxx - 001 - file1.mp4」、「xxxx - 002 - file2.mp4」「xxxx - 003 - file3.mp4」...时，你只需要复制前面的「xxxx」即可，后面的交给程序吧！

## 通过源码构建
- 下载并安装JDK，JDK版本至少为8以上
- 克隆本仓库的代码
- 导入到Eclipse、IntelliJ IDEA等Java IDE中
- 测试通过后，编译运行即可

## 为项目作出贡献（我在想peach）

fork本项目，加入您的代码片段后提交pull request即可

TODO：
- [X] [添加GUI实现](https://github.com/chemicalfiber/file-name-prefix-processor-GUI)
- [ ] ~~用Windows CMD脚本语言重写~~(非必要项目)
- [ ] ~~用GoLang重写，实现无JVM跨平台~~，已经有人实现了，参考兄弟项目
- [ ] 添加更多预定义的前缀处理规则

## 兄弟项目：

本工具的其他语言版本：

GoLang：https://github.com/GreatRunoob/Grocery-store/tree/main/filename-prefix-processor-go

Python：https://github.com/GreatRunoob/Grocery-store/tree/main/filename-prefix-processor-py

## 注意事项：
- 项目代码文件中含有部分注释和调试输出语句，如果您觉得其无用，可以将其删除
- 项目源代码仅在交流学习等非商业用途下可自由使用，商业用途需要取得相应授权