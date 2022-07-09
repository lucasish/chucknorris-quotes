package de.htwberlin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuotesRestController {

    private QuoteResponse quoteResponse;
// der Controller soll die Implementierung des Interfaces QuotesService benutzen, um sich einen Chuck Norris Spruch zu hole

    @Autowired
    public QuotesRestController(QuoteResponse quoteResponse){
        this.quoteResponse = quoteResponse;
    }

    // Der Endpunkt soll unter /api/v1/quotes und via GET erreichbar sein
    // der Client übermittelt den Index via Request-Parameter index, also z.B. /api/v1/quotes?index=53
    @RequestMapping(value="/api/v1/quotes", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<String> fetchQuote(@RequestParam(value="index") int index) {

//      Verwenden Sie für die Rückgabe die Klasse QuoteResponse (ggf. mit ResponseEntity als Wrapper)
        return ResponseEntity.ok(quoteResponse.getQuote(index));
    }


}
