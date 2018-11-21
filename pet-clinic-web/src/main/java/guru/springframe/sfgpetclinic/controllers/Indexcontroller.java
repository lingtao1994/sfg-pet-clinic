package guru.springframe.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LT
 * @Date on 2018/11/20
 */
@Controller
public class Indexcontroller {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(){

        return "index";
    }
}
