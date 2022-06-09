package ru.pashintsev.TestAB.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.pashintsev.TestAB.client.ExchangeClient;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class ExchangeController {

    private final ExchangeClient exchangeClient;


}
