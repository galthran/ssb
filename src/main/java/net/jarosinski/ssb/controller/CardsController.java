package net.jarosinski.ssb.controller;

import lombok.RequiredArgsConstructor;
import net.jarosinski.ssb.controller.dto.CardDTO;
import net.jarosinski.ssb.service.CardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CardsController {

    private final CardService cardService;

    @GetMapping("/myCards")
    public List<CardDTO> getCardDetails() {
        return cardService.getAllCards();
    }
}
