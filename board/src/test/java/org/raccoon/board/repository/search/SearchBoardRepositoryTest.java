package org.raccoon.board.repository.search;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SearchBoardRepositoryTest {

    // 이렇게 하려면 SearchBoardRepositoryImpl 클래스에
    // @Repository 어노테이션이 있어야함
    @Autowired
    private SearchBoardRepository searchBoardRepository;

    @Test
    public void testSearch() {
        searchBoardRepository.search1();

    }

}