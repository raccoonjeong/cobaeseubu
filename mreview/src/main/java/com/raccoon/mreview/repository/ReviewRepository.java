package com.raccoon.mreview.repository;

import com.raccoon.mreview.entity.Member;
import com.raccoon.mreview.entity.Movie;
import com.raccoon.mreview.entity.Review;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    /* @EntityGraph : 엔티티의 특정한 속성을 같이 로딩하도록 표시하는 어노테이션
    * attributePaths : 로딩 설정을 변경하고 싶은 속성의 이름을 배열로 명시
    * -> FETCH 속성 - attributePaths에 명시한 속성은 EAGER로 처리, 나머지는 LAZY로 처리
    * -> LOAD 속성 - attributePaths에 명시한 속성은 EAGER로 처리, 나머지는 엔티티 클래스에 명시 or 기본방식으로 처리*/
    @EntityGraph(attributePaths = {"member"}, type = EntityGraph.EntityGraphType.FETCH)
    List<Review> findByMovie(Movie movie);

    @Modifying // update나 delete를 위해서는 반드시 필요함
    @Query("delete from Review mr where mr.member = :member")
    void deleteByMember(Member member);
}
