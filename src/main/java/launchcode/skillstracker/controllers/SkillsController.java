package launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping

public class SkillsController {

    // lives at localhost:8080
    @GetMapping
    public String landingPage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }


    // lives at localhost:8080/form
    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action ='favorites' method='POST'>" +
                "<label>Name<br>" +
                "<input type='text' name='name'>" +
                "</label><br>" +
                "<label>My favorite languages:<br>" +
                "<select name='language1'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label></br>" +
                "<label>My second favorite language:<br>" +
                "<select name='language2'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label></br>" +
                "<label>My third favorite language:<br>" +
                "<select name='language3'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "</label></br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    // lives at localhost:8080/form
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "favorites")
    public String favoriteLanguages(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
