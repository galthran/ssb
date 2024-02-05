package net.jarosinski.ssb.service;

import lombok.RequiredArgsConstructor;
import net.jarosinski.ssb.controller.dto.ContactMessageDTO;
import net.jarosinski.ssb.mapper.ContactMessageMapper;
import net.jarosinski.ssb.model.ContactMessage;
import net.jarosinski.ssb.repository.ContactMessageRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class ContactMessageService {

    private final ContactMessageRepository contactMessageRepository;

    private final ContactMessageMapper contactMessageMapper;

    private ContactMessageDTO saveContactMessage(ContactMessageDTO contactMessageDTO) {
        ContactMessage contactMessage = contactMessageMapper.contactMessageDTOToContactMessage(contactMessageDTO);
        contactMessage.setContactId(getServiceRequestNumber());
        contactMessage.setCreateDt(LocalDate.now());
        ContactMessage savedContactMessage = contactMessageRepository.save(contactMessage);
        return contactMessageMapper.contactMessageToContactMessageDTO(savedContactMessage);
    }

    private String getServiceRequestNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(999999999 - 9999) + 9999;
        return "SR" + randomNumber;
    }
}
