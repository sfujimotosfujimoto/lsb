package com.sfujimoto;

import com.sfujimoto.domain.Post;
import com.sfujimoto.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class SpringDataAccessApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringDataAccessApplication.class);

	// PostRepository
	@Autowired
	PostRepository postRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringDataAccessApplication.class, args);
	}

	// PostConstruct
    @PostConstruct
    void seePosts() {
	    logger.info("seePosts method called...");
	    for (Post post : postRepository.findAll()) {
	        logger.info(post.toString());
        }
    }
}
