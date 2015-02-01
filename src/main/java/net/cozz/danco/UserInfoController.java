package net.cozz.danco;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserInfoController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView displayLoginForm() {

        // This is a shortcut if we only have one attribute to put in our model
        return new ModelAndView("login", "newUserInfo", new UserInfo()); 
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String processLogin(HttpSession session,
                               @ModelAttribute UserInfo user) {

        session.setAttribute("name", user.getName());
        return "redirect:";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {

        session.removeAttribute("name");
        return "redirect:";
    }
}
