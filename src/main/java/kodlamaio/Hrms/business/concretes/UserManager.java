package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.UserService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.UserDao;
import kodlamaio.Hrms.ettities.concretes.Users;

@Service
public class UserManager implements UserService{

    private UserDao usersDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.usersDao=userDao;
    }

    @Override
    public DataResult<List<Users>> getAll() {
        return  new SuccessDataResult<List<Users>>(this.usersDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(Users users) {
        this.usersDao.save(users);
        return new SuccessResult("User Added");
    }
    
    


}