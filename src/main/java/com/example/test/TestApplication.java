package com.example.test;

//import com.example.test.context.properties.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ServletComponentScan//Servlet,Filter,Listener可以直接通过@WebServlet,@WebFilter,@WebListener注解自动注册,无需其他代码
public class TestApplication {
  /*  @Autowired
    private AuthorSettings authorSettings;*/

   /* @RequestMapping("/")
    public String index(){
        return  "author name is " +authorSettings.getName() +" and author age is " + authorSettings.getAge();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
