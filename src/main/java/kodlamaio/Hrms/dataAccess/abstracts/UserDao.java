package kodlamaio.Hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.ettities.concretes.Users;

public interface UserDao extends JpaRepository<Users, Integer>{

}
