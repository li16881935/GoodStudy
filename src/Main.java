public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // 版本控制系统:VCS, Version Control System
        // 1.集中式版本控制系统:SVN, subversion
        // 2.分布式版本控制系统:Git

        // svn服务器:taoCode, SVNChina
        // Git服务器:gitee, github

        // Git的使用

        // --system: 系统
        // --global: 当前用户
        // --local: 当前仓库

        // 第一次登陆的配置(添加/修改)
        // git config --global user.name "lpc"
        // git config --global user.email  "274231588@qq.com"

        // 删除git信息配置
        // git config --global --unset user.email

        // 查看git信息配置
        // git config --global --list

        // 初始化版本库
        // git init
        // 注:当前文件夹中,有文件要进行版本控制


        // 查看当前版本库的状态
        // git status

        // 指定某个版本进行版本控制
        // git add

        // 红色:未进行版本控制的文件
        // 绿色:新增版本控制的文件
        // 蓝色: 修改过,未提交

        // 与上个版本进行比较,查看修改的内容
        // git diff 文件
        // 注: 按q退出查看

        // 查看日志
        // git log

        // 回退版本
        // git reset --hard 版本号
        // git reset --hard^  一个^代表一级
        // git reset --hard~100  ~后是次数

        // HEAD: 当前的指向,最后一次提交的位置

        // git reset --hard HEAD^ 退回HEAD的前一个指向
        // git reset --hard HEAD^^ 退回HEAD的前二个指向
        // git reset --hard HEAD~n 退回HEAD的前n个指向

        // 查看所有的日志
        // git reflog

        // 工作区, 暂存区, 版本库, 远程仓库
        // 工作区: 当前编辑的工程
        // 暂存区: 执行git add 后, 文件会存入暂存区
        // 版本库:  执行 git commit后,文件会把暂存区的文件提交到版本库

        // 注:
        // 工作区, 暂存区, 版本库都在自己的电脑上
        // 暂存区, 版本库在.git文件中

        // 远程仓库: git服务器

        // 撤销修改
        // 1.工作区: 直接修改, 或命令 git checkout --  文件
        // 2.暂存区: 直接修改,再次add,或者命令: git reset HEAD 文件
        // 2.版本库: 版本回退

        // 删除文件














    }
}
