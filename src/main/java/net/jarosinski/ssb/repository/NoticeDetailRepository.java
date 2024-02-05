package net.jarosinski.ssb.repository;

import net.jarosinski.ssb.model.NoticeDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeDetailRepository extends CrudRepository<NoticeDetail, Long> {
}
