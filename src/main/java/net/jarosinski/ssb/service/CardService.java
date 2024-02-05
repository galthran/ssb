package net.jarosinski.ssb.service;

import lombok.RequiredArgsConstructor;
import net.jarosinski.ssb.controller.dto.CardDTO;
import net.jarosinski.ssb.mapper.CardMapper;
import net.jarosinski.ssb.model.Card;
import net.jarosinski.ssb.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository cardRepository;

    private final CardMapper cardMapper;

    public List<CardDTO> getAllCards() {
        Iterable<Card> iterable = cardRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                .map(this::convertCardToCardDTO)
                .toList();
    }

    private CardDTO convertCardToCardDTO(Card card) {
        return cardMapper.cardToCardDTO(card);
    }
}
