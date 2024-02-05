package net.jarosinski.ssb.mapper;

import net.jarosinski.ssb.controller.dto.ContactMessageDTO;
import net.jarosinski.ssb.model.ContactMessage;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContactMessageMapper {

    ContactMessageDTO contactMessageToContactMessageDTO(ContactMessage contactMessage);

    ContactMessage contactMessageDTOToContactMessage(ContactMessageDTO contactMessageDTO);
}
