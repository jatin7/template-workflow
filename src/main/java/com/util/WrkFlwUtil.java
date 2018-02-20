package com.util;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


public class WrkFlwUtil {
    private KieContainer kieContainer;

    public WrkFlwUtil(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public <T> T loadKieSession(T obj,String sessionName){
        KieSession kSession = kieContainer.newKieSession(sessionName);
        kSession.insert(obj);
        kSession.fireAllRules();
        kSession.dispose();

        return obj;
    }
}
