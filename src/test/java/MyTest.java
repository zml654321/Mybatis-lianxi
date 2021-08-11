import com.chb.dao.StudentMapper;
import com.chb.dao.UserDao;
import com.chb.pojo.Student;
import com.chb.pojo.User;
import com.chb.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
@Test
    public void selectUser(){
    SqlSession session= MybatisUtils.getSession();
    UserDao mapper = session.getMapper(UserDao.class);
    List<User> users = mapper.selectUser();

    for (User user: users){
        System.out.println(user);
    }
    session.close();
}
@Test
public void tsetSelectUserById() {
    SqlSession session = MybatisUtils.getSession();  //获取SqlSession连接
    UserDao mapper = session.getMapper(UserDao.class);
    User user = mapper.selectUserByNP("zml","123");
    System.out.println(user);
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("username","zml");
    map.put("pwd","123");
    User user1 = mapper.selectUserByNP2(map);
    System.out.println(user1);
    session.close();
}
    @Test
    public void testAddUser() {
        SqlSession session = MybatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);
        User user = new User(2,"赵","zxcvbn");
        int i = mapper.addUser(user);
        System.out.println(i);
        session.commit(); //提交事务,重点!不写的话不会提交到数据库
        session.close();
    }
    @Test
    public void testUpdateUser() {
        SqlSession session = MybatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);
        User user = mapper.selectUserById(1);
        user.setPassword("assdf");
        int i = mapper.updateUser(user);
        System.out.println(i);
        session.commit(); //提交事务,重点!不写的话不会提交到数据库
        session.close();
    }
    @Test
    public void testDeleteUser() {
        SqlSession session = MybatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);
        int i = mapper.deleteUser(5);
        System.out.println(i);
        session.commit(); //提交事务,重点!不写的话不会提交到数据库
        session.close();
    }
    @Test
    public void testSelectUserById() {
        SqlSession session = MybatisUtils.getSession();  //获取SqlSession连接
        UserDao mapper = session.getMapper(UserDao.class);
        User user = mapper.selectUserById(1);
        System.out.println(user);
        session.close();
    }
    //注意导包：org.apache.log4j.Logger
    static Logger logger = Logger.getLogger(MyTest.class);

    @Test
    public void selectUser1(){
        logger.info("info：进入selectUser方法");
        logger.debug("debug：进入selectUser方法");
        logger.error("error: 进入selectUser方法");
        SqlSession session = MybatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);
        List<User> users = mapper.selectUser();
        for (User user: users){
            System.out.println(user);
        }
        session.close();
    }
    //分页查询 , 两个参数startIndex , pageSize
    @Test
    public void testSelectUser() {
        SqlSession session = MybatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);

        int currentPage = 2;  //第几页
        int pageSize = 2;  //每页显示几个
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("startIndex",(currentPage-1)*pageSize);
        map.put("pageSize",pageSize);

        List<User> users = mapper.selectUsers(map);

        for (User user: users){
            System.out.println(user);
        }

        session.close();
    }
    @Test
    public void testGetAllUser() {
        SqlSession session = MybatisUtils.getSession();
        //本质上利用了jvm的动态代理机制
        UserDao mapper = session.getMapper(UserDao.class);

        List<User> users = mapper.getAllUser();
        for (User user : users){
            System.out.println(user);
        }

        session.close();
    }
    @Test
    public void testSelectUserByIds() {
        SqlSession session = MybatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);

        User user = mapper.selectUserById(1);
        System.out.println(user);

        session.close();
    }
    @Test
    public void testAddUsers() {
        SqlSession session = MybatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);

        User user = new User(10, "秦疆", "123456");
        mapper.addUser(user);

        session.close();
    }
    @Test
    public void testUpdateUsers() {
        SqlSession session = MybatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);

        User user = new User(10, "秦疆", "zxcvbn");
        mapper.updateUser(user);

        session.close();
    }
    @Test
    public void testDeleteUsers() {
        SqlSession session = MybatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);

        mapper.deleteUser(6);

        session.close();
    }
    @Test
    public void testGetStudents(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudents();

        for (Student student : students){
            System.out.println(
                    "学生名:"+ student.getName()
                            +"\t老师:"+student.getTeacher().getName());
        }
    }
}
