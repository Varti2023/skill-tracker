package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String displaySkills(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is a list!</h2>" +
                "<table style=\"border:1px solid black\" align=center>" +
                "<tr><td>Java</td></tr>" +
                "<tr><td>Javascript</td></tr>" +
                "<tr><td>Python</td></tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("/form")
    public String userForm(){
        return "<html>" +
                "<body>" +
                "<form action='/form' method='post'>" +
                "<label for='name'>Your Name:</label>" +
                "<input type='text' name='name'>" +
                "</br>"+
                "<label for='firstLang'>First favorite language:</label>" +
                "<select name='firstFavLang' id='favLang'>" +
                "<option>Java</option>" +
                "<option>Javascript</option>" +
                "<option>Python</option>" +
                "</select>" +
                "</br>"+
                "<label for='secondLang'>Second favorite language:</label>" +
                "<select name='secondFavLang' id='favLang'>" +
                "<option>Java</option>" +
                "<option>Javascript</option>" +
                "<option>Python</option>" +
                "</select>" +
                "</br>"+
                "<label for='thirdLang'>Third favorite language:</label>" +
                "<select name='thirdFavLang' id='favLang'>" +
                "<option>Java</option>" +
                "<option>Javascript</option>" +
                "<option>Python</option>" +
                "</select>" +
                "<input type='submit' value='Submit'>"+
                "</form>" +
                "<body>" +
                "<html>";

    }
    @ResponseBody
    @PostMapping("/form")
    public String formSubmit(@RequestParam String name, @RequestParam String firstFavLang, @RequestParam String secondFavLang, @RequestParam String thirdFavLang){
        System.out.println(name);
        return "<html>" +

                "<body>" +
                "<h1>Hi "+name+"</h1>"+
                "<ol>" +
                "<li>"+firstFavLang+"</li>" +
                "<li>"+secondFavLang+"</li>" +
                "<li>"+thirdFavLang+"</li>" +
                "</ol>";

    }

}
