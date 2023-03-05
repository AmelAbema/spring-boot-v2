package com.ivan.boot.repo;

import com.ivan.boot.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {}
