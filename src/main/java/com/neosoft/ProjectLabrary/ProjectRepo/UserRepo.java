package com.neosoft.ProjectLabrary.ProjectRepo;

import com.neosoft.ProjectLabrary.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Long> {
}
