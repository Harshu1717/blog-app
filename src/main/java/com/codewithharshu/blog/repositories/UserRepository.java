package com.codewithharshu.blog.repositories;

import com.codewithharshu.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
