package com.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Card {
    private int balance;
    private int minAmtWthdrw;
    private int amtWthdrw;

}
