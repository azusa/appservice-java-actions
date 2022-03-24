package jp.fieldnotes.demo.vscode;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoroller {
    
    @RequestMapping(path="/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello!";
    }
}
