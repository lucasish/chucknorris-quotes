package de.htwberlin;

import de.htwberlin.QuotesService;
import org.springframework.stereotype.Service;

@Service
public class QuoteResponse implements QuotesService {

  private String quote;

  public QuoteResponse() {
    this.quote = quote;
  }

  public String getQuote(int index) {
    quote = QUOTES.get(index);
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }


}
