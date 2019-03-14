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
