package com.brs.daily_quote;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DailyQuoteController {
    // @Autowired
    private final DailyQuoteService service;

    public DailyQuoteController(DailyQuoteService service) {
        this.service = service;
    }

    @GetMapping
    public String Home(Model model) {
        // var service = new DailyQuoteService();
        model.addAttribute("quote", service.getQuote());
        return "index";
    }


   

}
