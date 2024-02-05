package net.jarosinski.ssb.mapper;

import net.jarosinski.ssb.controller.dto.CardDTO;
import net.jarosinski.ssb.model.Card;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {

    Card cardDTOToCard(CardDTO cardDTO);

    CardDTO cardToCardDTO(Card card);
}
