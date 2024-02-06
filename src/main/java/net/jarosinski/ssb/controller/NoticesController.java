package net.jarosinski.ssb.controller;

import lombok.RequiredArgsConstructor;
import net.jarosinski.ssb.controller.dto.NoticeDetailDTO;
import net.jarosinski.ssb.service.NoticeDetailService;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequiredArgsConstructor
public class NoticesController {

    private final NoticeDetailService noticeDetailService;

    @GetMapping("/notices")
    public ResponseEntity<List<NoticeDetailDTO>> getNotices() {
        List<NoticeDetailDTO> noticesList = noticeDetailService.getAllNoticeDetails();
        return ResponseEntity.ok()
                .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
                .body(noticesList);
    }
}
