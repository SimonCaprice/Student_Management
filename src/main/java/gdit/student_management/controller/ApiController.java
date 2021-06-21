package gdit.student_management.controller;


import gdit.student_management.config.MD5;
import gdit.student_management.model.User;
import gdit.student_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/api")
public class ApiController {
    private String username;
    private String password;
    private Model model;
    private HttpServletRequest request;

    @ResponseBody
    @GetMapping("test")
    public String test(String name) {
        return "test/" + name;
    }
    @RequestMapping(value="/getPage")
    public ModelAndView getPage(ModelAndView modelAndView, String pageName){
        pageName = null == pageName ? "index" : pageName;
        modelAndView.setViewName(pageName);
        return modelAndView;
    }
    @Autowired
    private UserService userServiceImpl;



    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String loginIndex() {
        return "login";
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(@RequestParam(name = "username")String username, @RequestParam(name = "password")String password,
                        Model model, HttpServletRequest request) {
        User user = userServiceImpl.getPwd(username);
        String pwd = user.getPassword();
        String password1 = MD5.crypt(password);
        if (pwd.equals(password1)) {
            model.addAttribute("user", user);
            request.getSession().setAttribute("user", user);
            return "index";
        } else {
            return "login";
        }
    }
}

