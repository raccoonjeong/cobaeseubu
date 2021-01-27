package org.raccoon.guestbook.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.raccoon.guestbook.dto.GuestbookDTO;
import org.raccoon.guestbook.entity.Guestbook;
import org.raccoon.guestbook.repository.GuestbookRepository;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor // 의존성 자동 주입
public class GuestbookServiceImpl implements GuestbookService {

    private final GuestbookRepository repository; // 반드시 final로
    @Override
    public Long register(GuestbookDTO dto) {
        log.info("DTO...............");
        log.info(dto);

        Guestbook entity = dtoToEntity(dto);
        log.info(entity);

        repository.save(entity);

        return entity.getGno();
    }
}
