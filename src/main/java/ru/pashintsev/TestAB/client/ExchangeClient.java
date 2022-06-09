package ru.pashintsev.TestAB.client;

//import
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.pashintsev.TestAB.rest.response.Exchange;
import ru.pashintsev.TestAB.rest.response.ExchangeHistory;


@FeignClient(value = "openexchange-api", url = "https://openexchangerates.org/api/latest.json")
public interface ExchangeClient {

    @RequestMapping(method = RequestMethod.GET, value = "https://openexchangerates.org/api/latest.json?app_id=fcf13718dfde40aa89e938d61c78dec1")
    Exchange readExchange();

    @RequestMapping(method = RequestMethod.GET, value = "https://openexchangerates.org/api/historical/2022-06-07.json?app_id=fcf13718dfde40aa89e938d61c78dec1")
    ExchangeHistory readExchangeHistory();

}
