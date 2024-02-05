package net.jarosinski.ssb.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoticeDetailDTO {

    private Long noticeId;

    private String noticeSummary;

    private String noticeDetails;

    private LocalDate noticeBeginDt;

    private LocalDate noticeEndDt;

    private LocalDate createDt;

    private LocalDate updateDt;
}
