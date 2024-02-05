package net.jarosinski.ssb.mapper;

import net.jarosinski.ssb.controller.dto.NoticeDetailDTO;
import net.jarosinski.ssb.model.NoticeDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NoticeDetailMapper {

    NoticeDetailDTO noticeToNoticeDetailDTO(NoticeDetail noticeDetail);

    NoticeDetail noticeDetailDTOToNotice(NoticeDetailDTO noticeDetailDTO);
}
