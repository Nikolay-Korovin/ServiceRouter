package userService;

import webService.User;
import webService.UserServiceImplService;


public class UserService {
    UserServiceImplService serviceImplService = new UserServiceImplService();
    webService.UserService userService = serviceImplService.getUserServiceImplPort();

    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User();
        user.setUserName("Nikolay");
        user.setLastName("Korovin");
        user.setFirstName("kol9");

        userService.saveUser(user);
        System.out.println(userService.getUserById("Nikolay").getUserName());
        System.out.println(userService.deleteUser(user));


    }


    public boolean saveUser(User user){
        return userService.save(user);
    }

    public boolean deleteUser(User user){
        return userService.delete(user);
    }

    public User getUserById(String id){
       return userService.geUserByUserName(id);
    }


}
