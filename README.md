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



![](assets/1f5e5ded56e9fbcd2e34ecef466a47cb61a6c4be.png)



![](assets/3772eabec3e129306348ff0b27b1d355fa82ce98.png)

    （2）直接使用idea（idea U版本，社区版的没有此功能）工具构建新项目

              Use the idea tool (idea U version, community version does not have this function) to build a new project directly

                

               我这里使用的Java JDK版本是 1.8.0_201

                The Java JDK version I use here is 1.8.0_201

        

![](assets/61af0f76c168c2bb7b4ac93ad65e0b772cab2a0d.png)



![](assets/62b56009ce7eae27b17ac0c727f6e9ac289e162d.png)

### 2.搭建数据库环境

    Build a database environment

    我使用的是MySQL 5.7.44，navicat premium lite 社区版

    I am using MySQL 5.7.44, Navicat Premium Lite Community Edition



![](assets/6997db0a73a11666bd25bc6fef65dd1ba62d9647.png)

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

![](assets/e4cc82d0616951d5b7bf0f3ce11450e653111d5c.png)

![](assets/d0cb426bc56a589aade80b167659fac709f40994.png)

![](assets/1dce097258354ac3952ee7d57ce8da7e2c47c112.png)

![](assets/7c876dacb37a73ba4ce17b19f8f20e408a24e46f.png)

![](assets/eba52cce1ff63593c1a4aebb400ad825c76f7cbd.png)

![](assets/a3eccf28a42565e66bdb1dcd0dd3812c84db8a2b.png)

![](assets/d75d6347e93b80302999bd0c8041389ca2eafe45.png)

![](assets/e1f05d18f74a392aad1c75c9131d423b22b5296f.png)

![](assets/59a75fa7a8c1717437826094d7dd483b494fc75a.png)

![](assets/6997db0a73a11666bd25bc6fef65dd1ba62d9647.png)

### 4.项目中可能遇到的问题

    Problems you may encounter in the project

    你在搭建好前后台项目后可能会发现项目无法构建的问题，这个时候就要查看后端项目是否正确配置环境了，像maven库插件的地址，建议国内使用阿里巴巴镜像源，然后在本地maven库中setting.xml文件中设置阿里镜像源地址。

    After you have built the front-end and back-end projects, you may find that the project cannot be built. At this time, you need to check whether the back-end project has configured the environment correctly. For example, for the address of the Maven library plug-in, it is recommended to use the Alibaba mirror source in China, and then set the Alibaba mirror source address in the setting.xml file in the local Maven library.

![](assets/8085fbbe8db84968913c6d56ad890bfa771e6745.png)

![](assets/64e65c62783abdf8d521c2cc46b827bdb3f93070.png)

![](assets/e50c4e2711439f532b7b9c992e54fd4484949615.png)

![](assets/875273eaf7b71f798389acbe75b446c5c3a14ced.png)

![](assets/dfccf60192fb204e367e1df6011f21f42746fb4e.png)

![](assets/b66ed2900e3c5a0cf2ac2f787e781d634495c473.png)

![](assets/a027dd7942b50197716e8664bd8fb2cf7bfb11e0.png)

![](assets/1272980e3474bdf6231e2eb370f7b7b3f2884825.png)

### 参考资料

References

1.[15分钟快速搭建 Springboot+Vue+Mysql 全栈开发环境_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1Dx4y1x719/?spm_id_from=333.1387.favlist.content.click&vd_source=b98a4bb3352b7210efd735d586192e59)

2.[idea运行ssm项目部署教程（实操）小白也会部署教程_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1P9RkYuENr?spm_id_from=333.788.player.switch&vd_source=b98a4bb3352b7210efd735d586192e59)

3.[Spring Boot + Spring + MyBatis + Vue + MySQL开发环境搭建之创建 Spring Boot 项目_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1WToXYMEWC/?spm_id_from=333.1387.favlist.content.click&vd_source=b98a4bb3352b7210efd735d586192e59)

4.[Aizhuxueliang/springboot-vue: springboot+vue实现增删改查及分页小DEMO](https://github.com/Aizhuxueliang/springboot-vue)

希望这个小小的项目能够为各位入门学习Java的初学者提供帮助。

I hope this small project can help beginners who are starting to learn Java.
