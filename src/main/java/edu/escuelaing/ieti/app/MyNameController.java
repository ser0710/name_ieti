package edu.escuelaing.ieti.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {
    @GetMapping({"/", "/home", "/status"})
    public String getStatus(){
        return "Sergio Rozo";
    }
}
