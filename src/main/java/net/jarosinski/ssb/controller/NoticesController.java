package net.jarosinski.ssb.controller;

import lombok.RequiredArgsConstructor;
import net.jarosinski.ssb.controller.dto.NoticeDetailDTO;
import net.jarosinski.ssb.service.NoticeDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NoticesController {

    private final NoticeDetailService noticeDetailService;

    @GetMapping("/notices")
    public List<NoticeDetailDTO> getNotices() {
        return noticeDetailService.getAllNoticeDetails();
    }
}
