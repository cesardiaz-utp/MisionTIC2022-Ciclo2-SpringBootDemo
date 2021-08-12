package co.edu.utp.misiontic2022.c2.cdiaz.gr48sbdemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.utp.misiontic2022.c2.cdiaz.gr48sbdemo.model.entity.User;
import co.edu.utp.misiontic2022.c2.cdiaz.gr48sbdemo.model.repository.UserRepository;

/**
 * SecurityService
 */
@Service
public class SecurityService {

    private UserRepository repository;

    public SecurityService(UserRepository userRepository){
        this.repository = userRepository;
    }

    public void saveNewUser(String name, String pass) {
        var user = new User();
        user.setName(name);
        user.setPass(pass);

        repository.save(user);
    }

    public List<User> getAllUsers(){
        return repository.findAll();
    }
    
}