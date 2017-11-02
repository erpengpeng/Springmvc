package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.SocketPermission;

/**
 * 模板测试
 */

@RestController
@RequestMapping("/API/Student")
public class StudentContorller {

    @RequestMapping(method = RequestMethod.GET)
    public String get(){
        return  "{\"id\":\"1\",\"name\":\"1111111111\"}";

    }


    @RequestMapping(method = RequestMethod.POST)
    public String Post() {
        return "{\"id\":\"2\",\"name\":\"2222222222\"}";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String Put() {
        return "{\"id\":\"3\",\"name\":\"3333333333\"}";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String DELETE() {
        return "{\"id\":\"4\",\"name\":\"4444444444\"}";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String Get(@PathVariable("id") Integer id) {
        return "{\"id\":\""+id+"\",\"name\":\"get path variable id\"}";
    }
}
