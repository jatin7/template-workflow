package com.controller;

import com.model.Card;
import com.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @RequestMapping(value = "/getCard", method = RequestMethod.GET, produces = "application/json")
    public Card getCard(@RequestParam(required = true) Integer minAmtWthdrw){
        Card card = Card.builder().minAmtWthdrw(minAmtWthdrw).build();
        return cardService.test(card);
    }

}
