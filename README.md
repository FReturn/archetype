# archetype
定制通用的项目骨架，便于快速生成可运行项目

统一管理所有常用的项目骨架,每个module是一种风格的骨架.通过每个骨架生成的项目,可以直接运行

骨架基本要求:
1,基本工具包
2,日志系统
3,spring框架
4,web工程


#### web-simple模块
简单的web应用骨架,不分模块,只分包.已组装以下部分
1,spring管理容器
2,springmvc负责http请求处理
3,提供日志系统支持
4,提供切面能力支持
5,提供持久层支持(mysql+mybatis)
6,提供快捷的mybatis配置的生成
7,spring-test+junit测试框架


demo:
1,同步页面访问
2,json数据访问(通常是使用ajax访问的场景)
3,持久层测试