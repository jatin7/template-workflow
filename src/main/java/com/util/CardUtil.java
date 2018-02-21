package com.util;

import com.model.Card;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CardUtil {

    //imaging fetching from the database
    public static void checkBalance(Card card){
        log.debug("checking balance");
        card.setBalance(1000);
    }
}
