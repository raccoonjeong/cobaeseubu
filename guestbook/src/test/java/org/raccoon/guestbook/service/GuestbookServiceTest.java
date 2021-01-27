package org.raccoon.guestbook.service;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.raccoon.guestbook.dto.GuestbookDTO;
import org.raccoon.guestbook.entity.Guestbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class GuestbookServiceTest {

    @Autowired
    private GuestbookService service;

    @Test
    public void testRegister() {
        GuestbookDTO guestbookDTO = GuestbookDTO.builder()
                .title("Sample Title...")
                .content("Sample Content...")
                .writer("user0")
                .build();
        System.out.println(service.register(guestbookDTO));
    }

}