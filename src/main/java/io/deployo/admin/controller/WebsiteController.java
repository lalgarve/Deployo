package io.deployo.admin.controller;

import io.deployo.admin.model.domain.Website;
import io.deployo.admin.service.ServerService;
import io.deployo.admin.service.WebsiteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/website")
public class WebsiteController {
    private ServerService serverService;
    private WebsiteService websiteService;

    @PostMapping(value = "/add")
    public String addWebsite(Website website, Model model){

        return "/website/list";
    }
}
