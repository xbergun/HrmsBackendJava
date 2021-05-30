package kodlamaio.Hrms.apicontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.UserService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.ettities.concretes.Users;



@RestController
@RequestMapping("/api/users")

public class UserController {
	private UserService usersService;

    @Autowired
    public UserController(UserService usersService) {
        super();
        this.usersService = usersService;
    }

    @GetMapping("/getall")
    public DataResult<List<Users>> getAll(){
        return this.usersService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Users users) {
        return this.usersService.add(users);
    }
}
