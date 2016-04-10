package controllers;

import net.paoding.rose.web.Invocation;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;

/**
 * Created by pczb on 16/4/10.
 */
//打开localhost:8080/${artifactId}/ 能看到页面
@Path("/")
public class MainController {

    @Get("/")
    public String hello(Invocation invocation){
        String reqIp = invocation.getRequest().getRemoteAddr();
        return "@Hello: " + reqIp;
    }
}
