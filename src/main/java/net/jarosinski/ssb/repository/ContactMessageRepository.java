package net.jarosinski.ssb.repository;

import net.jarosinski.ssb.model.ContactMessage;
import org.springframework.data.repository.CrudRepository;

public interface ContactMessageRepository extends CrudRepository<ContactMessage, String> {
}
