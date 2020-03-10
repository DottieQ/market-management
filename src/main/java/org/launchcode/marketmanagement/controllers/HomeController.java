package org.launchcode.marketmanagement.controllers;

//created by Dottie Quick

import org.launchcode.marketmanagement.models.EventOrganizer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController  {

    // Handles requests of the "create" form - processCreateEventOrganizerForm
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String firstName){
        return "Hello, " + firstName + "!";
    }

    @GetMapping("create")
    public String processCreateEventOrganizerForm(){
            //(@RequestParam String eventOrganizerNameInhtmlForm) {
       // eventOrganizers.add(new EventOrganizer(eventOrganizerFirstName, eventOrganizerLastName));
        return "CreateUserForm";
    }

}
