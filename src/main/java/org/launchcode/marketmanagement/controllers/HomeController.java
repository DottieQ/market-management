package org.launchcode.marketmanagement.controllers;

//created by Dottie Quick

import org.launchcode.marketmanagement.Data.EventOrganizerRepository;
import org.launchcode.marketmanagement.models.EventOrganizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("organizers")
public class HomeController  {

    @Autowired
    private EventOrganizerRepository eventOrganizerRepository;

    // Handles requests of the "create" form - processCreateEventOrganizerForm
//    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
////    @ResponseBody
////    public String hello(@RequestParam String firstName){
////        return "Hello, " + firstName + "!";
////    }


    @GetMapping("createUserForm")
    public String displayCreateEventOrganizerForm(){
            //(@RequestParam String eventOrganizerNameInhtmlForm) {
       // eventOrganizers.add(new EventOrganizer(eventOrganizerFirstName, eventOrganizerLastName));
        return "CreateUserForm";
    }

    @PostMapping("createUserForm")
    public String processCreateEventOrganizerForm(@ModelAttribute @Valid EventOrganizer newEventOrganizer, Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Create New Event Organizer");
            return "organizers/createUserForm";
        }
        eventOrganizerRepository.save(newEventOrganizer);
        return "redirect";
    }

}
