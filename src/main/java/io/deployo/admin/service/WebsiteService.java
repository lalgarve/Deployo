package io.deployo.admin.service;

import io.deployo.admin.model.domain.Website;
import io.deployo.admin.repository.WebsiteRepostitory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WebsiteService {
    private WebsiteRepostitory websiteRepostitory;

    public void saveWebsite(Website website){
        websiteRepostitory.save(website);
    }
}
