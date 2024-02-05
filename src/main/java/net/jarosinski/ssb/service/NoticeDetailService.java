package net.jarosinski.ssb.service;

import lombok.RequiredArgsConstructor;
import net.jarosinski.ssb.controller.dto.NoticeDetailDTO;
import net.jarosinski.ssb.mapper.NoticeDetailMapper;
import net.jarosinski.ssb.model.NoticeDetail;
import net.jarosinski.ssb.repository.NoticeDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class NoticeDetailService {

    private final NoticeDetailRepository noticeDetailRepository;

    private final NoticeDetailMapper noticeDetailMapper;

    public List<NoticeDetailDTO> getAllNoticeDetails() {
        Iterable<NoticeDetail> iterable = noticeDetailRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                .map(this::convertNoticeDetailToNoticeDetailDTO)
                .toList();
    }

    private NoticeDetailDTO convertNoticeDetailToNoticeDetailDTO(NoticeDetail noticeDetail) {
        return noticeDetailMapper.noticeToNoticeDetailDTO(noticeDetail);
    }
}
