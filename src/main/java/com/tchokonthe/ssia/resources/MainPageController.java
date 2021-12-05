package com.tchokonthe.ssia.resources;

import com.tchokonthe.ssia.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author martin
 * @created on 23/11/2021 at 01:04
 * @project com.tchokonthe.ssia.resources
 * @email (martin.aurele12 @ gmail.com)
 */


@Controller
@RequiredArgsConstructor
public class MainPageController {

    private final ProductService productService;

    @GetMapping("/main")
    public String main(Authentication authentication, Model model) {
        model.addAttribute("username", authentication.getName());
        model.addAttribute("products", productService.findAll());

        return "main.html";
    }
}
