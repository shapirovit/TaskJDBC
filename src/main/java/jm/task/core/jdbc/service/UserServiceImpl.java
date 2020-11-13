package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoHibernateImpl();

    public void createUsersTable() {
        userDao.createUsersTable();
//        new UserDaoHibernateImpl().createUsersTable();
//        new UserDaoJDBCImpl().createUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
//        new UserDaoHibernateImpl().dropUsersTable();
//        new UserDaoJDBCImpl().dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
//        new UserDaoHibernateImpl().saveUser(name, lastName, age);
//        new UserDaoJDBCImpl().saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
//        new UserDaoHibernateImpl().removeUserById(id);
//        new UserDaoJDBCImpl().removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
//        return new UserDaoHibernateImpl().getAllUsers();
//        return new UserDaoJDBCImpl().getAllUsers();
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
//        new UserDaoHibernateImpl().cleanUsersTable();
//        new UserDaoJDBCImpl().cleanUsersTable();
    }
}
