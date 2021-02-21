package org.raccoon.board.service;

import org.junit.jupiter.api.Test;
import org.raccoon.board.dto.ReplyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ReplyServiceTest {

    @Autowired
    private ReplyService service;

    @Test
    public void testGetList() {
        Long bno = 100L;
        List<ReplyDTO> replyDTOList = service.getList(bno);

        replyDTOList.forEach(replyDTO -> System.out.println(replyDTO));
    }

}