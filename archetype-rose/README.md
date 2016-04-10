#paoding-rose

clone之后，在本目录下运行`mvn install`
在需要建力新项目的地方运行`mvn archetype:generate -DarchetypeCatalog=local`
然后在项目目录下运行`mvn jetty:run`
在浏览器中输入localhost:8080/${artifcatId}既能看到hello+Ip字样
