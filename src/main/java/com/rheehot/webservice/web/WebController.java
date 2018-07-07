package com.rheehot.webservice.web;

import com.rheehot.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {

//    @GetMapping("/") // = @RequestMapping(value="/", method = RequestMethod.GET)
//    public String main() {
//        return "main";
//    }

    private PostsService postsService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "main";
    }
}
