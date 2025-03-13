package com.example.demo.controller;


import com.example.demo.service.AppendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class CustomController {

private final AppendService appendService;
    @Autowired
    public CustomController (AppendService appendService) {
        this.appendService = appendService;

    }
@GetMapping("/hello")
    public String testWorld() {


    return "Hello World!!!" + appendService.appendText("           ");
}

    @GetMapping("/ape")
    public String value() {
        return appendService.append("value");



    }

@GetMapping("/ap")
    public String SayHello(@RequestParam(name = "value" ) String value ) {
return appendService.appendText(value);



}
@GetMapping("/Ape/text") public String sayHello(@PathVariable(value="text")String text)
{return "yo," + appendService.append(text);}
    }



