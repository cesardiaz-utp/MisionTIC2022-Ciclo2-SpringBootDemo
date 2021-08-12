package co.edu.utp.misiontic2022.c2.cdiaz.gr48sbdemo.view;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.utp.misiontic2022.c2.cdiaz.gr48sbdemo.model.entity.User;
import co.edu.utp.misiontic2022.c2.cdiaz.gr48sbdemo.services.SecurityService;

@RestController
public class HelloController {

    private SecurityService service;

    public HelloController(SecurityService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String sayHelloWorld() {
        return "Hola a todos los del grupo 480";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloToStudent(@PathVariable String name) {
        return "Hola " + name + "!";
    }

    @GetMapping("/user")
    public String registerNewUser(@RequestParam("name") String name, @RequestParam("pass") String pass) {
        service.saveNewUser(name, pass);
        return name.toString();
    }

    @GetMapping("/user/all")
    public String getAllUsers() {
        var response = "";
        var list = service.getAllUsers();
        for (User user : list) {
            if (!response.isBlank()) {
                response += ", ";
            }
            response += user.getName();
        }
        return response;
    }

    @GetMapping("/user/json")
    public List<User> getJsonUsers(){
        return service.getAllUsers();
    }

}
