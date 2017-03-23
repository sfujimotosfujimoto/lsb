package com.sfujimoto.repository;
/* sfujimoto: 2017/03/23 18:16 */

import com.sfujimoto.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {


}
