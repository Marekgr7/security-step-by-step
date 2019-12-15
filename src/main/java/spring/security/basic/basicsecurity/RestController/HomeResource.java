package spring.security.basic.basicsecurity.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

        @GetMapping("/")
        public String home(){
            return "<h1>Welcome</h1>";
        }

        @GetMapping("/admin")
        public String admin(){
            return "Hello Admin";
        }

        @GetMapping("/user")
        public String user(){
        return "Hello user";
        }

}
