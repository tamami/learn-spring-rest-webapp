package lab.aikibo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lab.aikibo.domain.Message;

@RestController
public class HelloWorldRestController {

  @RequestMapping("/")
  public String welcome() {
    return "Welcome to RestTemplate Example";
  }

  @RequestMapping("/hello/{user}")
  public Message message(@PathVariable String user) {
    Message msg = new Message(user, "Hi " + user);
    return msg;
  }
}
