# springboot-vue-practice-project

一个简单的mysql前后端演示项目，大家可以搜索这个仓库进行学习。



A simple frontend and backend demo project with mysql, everyone can search this repository for study.



此项目使用的一些工具：

    前端：vue 2.0, elment UI, vue-router, webpack等；

    后端：springtboot, maven, mybatis, 等；

    数据库：MySQL, navcat等；



Some tools used in this project:

    Front-end: vue 2.0, elment UI, vue-router, webpack, etc.;

    Back-end: springtboot, maven, mybatis, etc.;

    Database: MySQL, navcat, etc.



### 1.搭建后端项目环境：

    Build the backend project environment



    这里提供两种思路，一个是使用阿里巴巴的镜像模板网站选择相对应的组件搭建模板（国内直接访问springboot网址是无法构建基于Java 8的环境的项目的），另一个就是使用idea工具的新建项目命令勾选对应的组件进行搭建。



    Two ideas are provided here. One is to use Alibaba's mirror template website to select the corresponding component to build the template (directly accessing the springboot website in China cannot build a project based on the Java 8 environment). The other is to use the new project command of the idea tool to check the corresponding component for construction.



    （1）访问阿里巴巴的springboot国内镜像源网址：[Cloud Native App Initializer](https://start.aliyun.com/)

               Visit Alibaba's springboot domestic mirror source website:  [Cloud Native App Initializer](https://start.aliyun.com/)



        这里我选择maven project，Java, 2.3.12.RELEASE, jar, 8, 单模块，组件选择spring web, JDBC api, MyBatis, MySQL等，其他设置默认。



        Here I choose Maven project, Java, 2.3.12.RELEASE, jar, 8, single module, components such as spring web, JDBC api, MyBatis, MySQL, etc., and leave other settings as default.



![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-46-47.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-47-29.png)



    （2）直接使用idea（idea U版本，社区版的没有此功能）工具构建新项目



              Use the idea tool (idea U version, community version does not have this function) to build a new project directly

                

               我这里使用的Java JDK版本是 1.8.0_201



                The Java JDK version I use here is 1.8.0_201

        ![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-52-21.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\屏幕截图%202025-04-26%20120929.png)



### 2.搭建数据库环境

    Build a database environment



    我使用的是MySQL 5.7.44，navicat premium lite 社区版



    I am using MySQL 5.7.44, Navicat Premium Lite Community Edition



![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-44-31.png)



### 3.前端环境搭建

    Front-end environment construction



    本项目使用的是vue 2.0版本的脚手架工具，请注意搭建时候的版本问题。



    This project uses the vue 2.0 version of the scaffolding tool, please pay attention to the version issues when building.



    可以参考如下资料搭建环境，本项目再不详细讲解，[第2章 Vue 环境快速搭建 | 深入理解Vue.js实战](https://godbasin.github.io/vue-ebook/vue-ebook/2.html)，[Quick Start | Vue.js](https://vuejs.org/guide/quick-start)

    

     You can refer to the following information to build the environment. This project will not be explained in detail.[第2章 Vue 环境快速搭建 | 深入理解Vue.js实战](https://godbasin.github.io/vue-ebook/vue-ebook/2.html)，[Quick Start | Vue.js](https://vuejs.org/guide/quick-start)

    



后端项目的本地端口配置为8081，前端端口配置为8080



The local port of the backend project is configured as 8081, and the frontend port is configured as 8080



前后台项目启动后，效果如下图所示：



After the front-end and back-end projects are started, the effect is as shown below:



![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-40-23.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-40-48.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-41-11.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-41-04.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-41-20.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-42-50.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-43-12.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-43-28.png)



![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-44-16.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-44-31.png)



### 4.项目中可能遇到的问题

    Problems you may encounter in the project



    你在搭建好前后台项目后可能会发现项目无法构建的问题，这个时候就要查看后端项目是否正确配置环境了，像maven库插件的地址，建议国内使用阿里巴巴镜像源，然后在本地maven库中setting.xml文件中设置阿里镜像源地址。



    After you have built the front-end and back-end projects, you may find that the project cannot be built. At this time, you need to check whether the back-end project has configured the environment correctly. For example, for the address of the Maven library plug-in, it is recommended to use the Alibaba mirror source in China, and then set the Alibaba mirror source address in the setting.xml file in the local Maven library.



    ![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-51-16.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-52-59.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-53-17.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-53-32.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-53-54.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-55-46.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\screenshot_2025-04-24_10-56-09.png)

![](C:\Users\mi\Desktop\springboot\springboot-vue-practice-project\descriptionImage\屏幕截图%202025-04-26%20123531.png)



### 参考资料

References



1.[15分钟快速搭建 Springboot+Vue+Mysql 全栈开发环境_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1Dx4y1x719/?spm_id_from=333.1387.favlist.content.click&vd_source=b98a4bb3352b7210efd735d586192e59)

2.[idea运行ssm项目部署教程（实操）小白也会部署教程_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1P9RkYuENr?spm_id_from=333.788.player.switch&vd_source=b98a4bb3352b7210efd735d586192e59)

3.[Spring Boot + Spring + MyBatis + Vue + MySQL开发环境搭建之创建 Spring Boot 项目_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1WToXYMEWC/?spm_id_from=333.1387.favlist.content.click&vd_source=b98a4bb3352b7210efd735d586192e59)

4.[Aizhuxueliang/springboot-vue: springboot+vue实现增删改查及分页小DEMO](https://github.com/Aizhuxueliang/springboot-vue)



希望这个小小的项目能够为各位入门学习Java的初学者提供帮助。

I hope this small project can help beginners who are starting to learn Java.
