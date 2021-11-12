package com.neosoft.ProjectLabrary.UserServices;

import com.neosoft.ProjectLabrary.Entity.Users;
import com.neosoft.ProjectLabrary.ProjectRepo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class Services {


    @Autowired
    private UserRepo userRepo;


    public String save(Users users){
        return userRepo.save(users) != null ? "Data inserted successfully" : "Data not inserted";
    }

    public List<Users> getAll(){
        return userRepo.findAll();
    }

    public Users get(Long Id) {
        return userRepo.findById(Id).orElse(new Users());

    }
}
