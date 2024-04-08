package io.deployo.admin.service;

import io.deployo.admin.repository.ServerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServerService {
    private ServerRepository serverRepository;
}
