package nextstep.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @RestController - 요청을 처리할 클래스임을 지정
@RestController
public class HelloController {
    private HelloDao helloDao;

    public HelloController(HelloDao helloDao){
        this.helloDao = helloDao;
    }

    // @GetMapping - "/hello" 요청을 처리할 메서드 지정
    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "") String name){
        if(name.isEmpty()) return "HelloWorld!";
        helloDao.insert(name);
        int count = helloDao.countByName(name);
        return "Hello " + name + " " + count + "번째 방문입니다";
    }
}
