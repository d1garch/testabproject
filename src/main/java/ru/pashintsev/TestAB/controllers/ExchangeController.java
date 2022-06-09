package ru.pashintsev.TestAB.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.pashintsev.TestAB.client.ExchangeClient;
import ru.pashintsev.TestAB.rest.response.Exchange;

@RestController
@RequestMapping(value = "/exchange")
@RequiredArgsConstructor
public class ExchangeController {

    private final ExchangeClient exchangeClient;

    @GetMapping
    public ResponseEntity readExchangeData(Exchange exchange) {
        return ResponseEntity.ok(exchangeClient.readExchange());
    }
}
