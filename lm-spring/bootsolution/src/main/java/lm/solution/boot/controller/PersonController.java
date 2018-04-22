package lm.solution.boot.controller;

import lm.solution.boot.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {


    @RequestMapping("/person")
    public String person(Model model){
        Person single = new Person("aa",11);

        List<Person> people=new ArrayList<>();
        Person p1 = new Person("xx",11);
        Person p2 = new Person("yy",22);
        Person p3 = new Person("zz",33);
        people.add(p1);
        people.add(p2);
        people.add(p3);

        model.addAttribute("singlePerson",single);
        model.addAttribute("people",people);

        return "person";
    }


}
