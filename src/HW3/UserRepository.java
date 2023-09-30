package HW3;

import java.util.ArrayList;
import java.util.List;


public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();


    public void addUser(User user) {
        if (!this.data.contains(user)) {
            this.data.add(user);
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logoutUsers() {
        List<User> newData = new ArrayList<>();
        for (User user : this.data) {
            if (!user.isAdmin) {
                user.logout();
            } else {
                newData.add(user);
            }
        }
        this.data = newData;
    }

    public List<User> getData() {
        return this.data;
    }

}