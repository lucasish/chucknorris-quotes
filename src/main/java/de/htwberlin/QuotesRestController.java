package de.htwberlin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuotesRestController {

    private QuoteResponse quoteResponse = new QuoteResponse();

    @Autowired
    public QuotesRestController(QuoteResponse quoteResponse){
        this.quoteResponse = quoteResponse;
    }

    @RequestMapping(value="/api/v1/quotes", method = RequestMethod.GET)
    public @ResponseBody String fetchQuote(@RequestParam(value="index") int index) {

        return quoteResponse.getQuote(index);
    }


}
