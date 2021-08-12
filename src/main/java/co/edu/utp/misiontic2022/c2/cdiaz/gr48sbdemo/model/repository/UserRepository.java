package co.edu.utp.misiontic2022.c2.cdiaz.gr48sbdemo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.utp.misiontic2022.c2.cdiaz.gr48sbdemo.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
