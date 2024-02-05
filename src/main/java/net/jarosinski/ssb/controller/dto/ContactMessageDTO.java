package net.jarosinski.ssb.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactMessageDTO {

    private String contactId;

    private String contactName;

    private String contactEmail;

    private String subject;

    private String message;

    private LocalDate createDt;
}
