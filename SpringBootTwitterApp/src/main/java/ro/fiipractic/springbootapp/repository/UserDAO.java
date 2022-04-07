package ro.fiipractic.springbootapp.repository;

import org.springframework.stereotype.Repository;
import ro.fiipractic.springbootapp.exception.UserNotFoundException;
import ro.fiipractic.springbootapp.model.user.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO {
    List<User> userList = new ArrayList<>();
    private int id=0;

    public List<User> getAllUsers() {
        return userList;
    }

    public void createUser(String firstName, String lastName, String email, String password) {

        User newUser = new User();
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setEmail(email);
        newUser.setPassword(password);
        newUser.setId(id);
        userList.add(newUser);
        id++;
    }

    public void updateUser(String firstName, String lastName, String email, String password, Integer id) {
        userList.get(id).setFirstName(firstName);
        userList.get(id).setLastName(lastName);
        userList.get(id).setEmail(email);
        userList.get(id).setPassword(password);
    }

    public User getUserById(Integer id) {

        if(id > this.id )
        {
            throw new UserNotFoundException(String.format("User with id %s was not found",id));
        }
        else
        {
            return userList.get(id);
        }
    }

    public void deleteUser(Integer id) {
        userList.remove(getUserById(id));
    }
}
