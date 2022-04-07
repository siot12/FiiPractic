package ro.fiipractic.springbootapp.serviceUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.fiipractic.springbootapp.model.user.User;
import ro.fiipractic.springbootapp.repository.UserDAO;;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService  {
    @Autowired
    private UserDAO userRepository;

    public List<User> getAllUsers()
    {
        return userRepository.getAllUsers();
    }

    @Override
    public void registerUser(User user)
    {
        userRepository.createUser(user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword());
    }

    @Override
    public void updateUser(Integer id, User user) {
        userRepository.updateUser(user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword(),id);

    }

    @Override
    public void patchUser(Integer id, Map<String, String> partialUser) {

        User user = userRepository.getUserById(id);
        patchUser(partialUser,user);

        userRepository.updateUser(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword(), id);
    }

    @Override
    public void deleteUser(Integer id) {

        userRepository.deleteUser(id);
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.getUserById(id);
    }

    private void patchUser(Map<String,String> partialUser,User user)
    {
        String firstName = partialUser.get("firstName");
        String lastName = partialUser.get("lastName");
        String email = partialUser.get("email");
        String password = partialUser.get("password");
        if(!firstName.isEmpty())
        {
            user.setFirstName(firstName);
        }
        if(!lastName.isEmpty())
        {
            user.setLastName(lastName);
        }
        if(!email.isEmpty())
        {
            user.setEmail(email);
        }
        if(!password.isEmpty())
        {
            user.setPassword(password);
        }
    }
}
