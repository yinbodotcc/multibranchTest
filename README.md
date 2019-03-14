# multibranchTest
测试multibranch pipeline

下面是使用git bash把本地源代码整体结构一并上传到github上来的：

$ git init

$ ls
myFirstPipeline  pom.xml  src/

$ git add .

$ git commit -m 'the initial edition'

#这样我们便在本地建立好了仓库，接下来需要将本地仓库与GitHub网站的仓库进行关联。
$ git remote add origin https://github.com/yinbodotcc/multibranchTest.git

#下面这个可以不要
$ git pull --rebase origin master

$ git push origin master
-------------------------------------------------------接下来我创建一个分支并修改代码后再次上传到github上，也形成了分支
$ git branch branchFirst

$ git checkout branchFirst

#这里修改了代码，省去内容。。。
$ git add .

$ git push origin branchFirst
Counting objects: 27, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (17/17), done.
Writing objects: 100% (27/27), 4.85 KiB | 552.00 KiB/s, done.
Total 27 (delta 4), reused 0 (delta 0)
remote: Resolving deltas: 100% (4/4), done.
remote:
remote: Create a pull request for 'branchFirst' on GitHub by visiting:
remote:      https://github.com/yinbodotcc/multibranchTest/pull/new/branchFirst
remote:
To https://github.com/yinbodotcc/multibranchTest.git
 * [new branch]      branchFirst -> branchFirst

13770940779@LAPTOP-RJSRAMS8 MINGW64 ~/Desktop/simpleTestCanDeleteLater-master/si                                                                                                                mpleTestCanDeleteLater-master (branchFirst)

