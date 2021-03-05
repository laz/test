package org.example.springboot.domain.posts;
import org.springframework.data.jpa.repository.JpaRepository;

//DB Layer 접근자
//CRUD 메소드 생성
public interface PostsRepository extends JpaRepository<Posts, Long>{

}
