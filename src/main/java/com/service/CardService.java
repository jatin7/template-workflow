package com.service;

import com.model.Card;
import com.util.WrkFlwUtil;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CardService {

    private KieContainer kieContainer;

    @Autowired
    public CardService(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public Card test(Card card){

        WrkFlwUtil wrkFlwUtil = new WrkFlwUtil(kieContainer);
        Card card1 = wrkFlwUtil.loadKieSession(card,"ksession-rule");

        return card1;
    }
}

