import com.chb.dao.BlogMapper;
import com.chb.dao.StudentMapper;
import com.chb.dao.TeacherMapper;
import com.chb.dao.UserDao;
import com.chb.pojo.Blog;
import com.chb.pojo.Student;
import com.chb.pojo.Teacher;
import com.chb.pojo.User;
import com.chb.util.IDUtil;
import com.chb.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;


import java.util.*;

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

 /*   @Test
    public void testGetStudents2(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudents2();

        for (Student student : students){
            System.out.println(
                    "学生名:"+ student.getName()
                            +"\t老师:"+student.getTeacher().getName());
        }
    }*/
    @Test
    public void testGetTeacher(){
        SqlSession session = MybatisUtils.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher.getName());
        System.out.println(teacher.getStudents());
    }
    @Test
    public void addInitBlog(){
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtil.genId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDUtil.genId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtil.genId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtil.genId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);

        session.close();
    }
    @Test
    public void testQueryBlogIf(){
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("title","Mybatis如此简单");
        map.put("author","狂神说");
        List<Blog> blogs = mapper.queryBlogIf(map);

        System.out.println(blogs);

        session.close();
    }
    @Test
    public void testUpdateBlog(){
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("title","动态SQL");
        map.put("author","秦疆");
        map.put("id","a81fd8e20f9340aa8d53c1344a7b6e4c");

        mapper.updateBlog(map);


        session.close();
    }
    @Test
    public void testQueryBlogChoose(){
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title","Java如此简单");
        map.put("author","狂神说");
        map.put("views",9999);
        List<Blog> blogs = mapper.queryBlogChoose(map);

        System.out.println(blogs);

        session.close();
    }
    @Test
    public void testQueryBlogForeach(){
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        map.put("ids",ids);

        List<Blog> blogs = mapper.queryBlogForeach(map);

        System.out.println(blogs);

        session.close();
    }
   /* @Test
   //每个sqlSession中的缓存相互独立
    public void testQueryUserById(){
        SqlSession session = MybatisUtils.getSession();
        SqlSession session2 = MybatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);
        UserDao mapper2 = session2.getMapper(UserDao.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);
        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        System.out.println(user==user2);

        session.close();
        session2.close();
    }*/
 /*  @Test
   //当前缓存中，不存在这个数据
   public void testQueryUserById(){
       SqlSession session = MybatisUtils.getSession();
       UserDao mapper = session.getMapper(UserDao.class);
       UserDao mapper2 = session.getMapper(UserDao.class);

       User user = mapper.queryUserById(1);
       System.out.println(user);
       User user2 = mapper2.queryUserById(2);
       System.out.println(user2);
       System.out.println(user==user2);

       session.close();
   }*/
  /* @Test
   public void testQueryUserById(){
       SqlSession session = MybatisUtils.getSession();
       UserDao mapper = session.getMapper(UserDao.class);

       User user = mapper.queryUserById(1);
       System.out.println(user);
       User user2 = mapper.queryUserById(1);
       System.out.println(user2);
       System.out.println(user==user2);

       session.close();
   }*/
   /* @Test
    //因为增删改操作可能会对当前数据产生影响
    public void testQueryUserById(){
        SqlSession session = MybatisUtils.getSession();
        UserDao mapper = session.getMapper(UserDao.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);

        HashMap map = new HashMap();
        map.put("name","kuangshen");
        map.put("id",4);
        mapper.updateUserss(map);

        User user2 = mapper.queryUserById(1);
        System.out.println(user2);

        System.out.println(user==user2);

        session.close();
    }*/
  /* @Test
   public void testQueryUserById(){
       SqlSession session = MybatisUtils.getSession();
       UserDao mapper = session.getMapper(UserDao.class);

       User user = mapper.queryUserById(1);
       System.out.println(user);

       session.clearCache();//手动清除缓存

       User user2 = mapper.queryUserById(1);
       System.out.println(user2);

       System.out.println(user==user2);

       session.close();
   }*/
   @Test
   public void testQueryUserById(){
       SqlSession session = MybatisUtils.getSession();
       SqlSession session2 = MybatisUtils.getSession();

       UserDao mapper = session.getMapper(UserDao.class);
       UserDao mapper2 = session2.getMapper(UserDao.class);

       User user = mapper.queryUserById(1);
       System.out.println(user);
       session.close();

       User user2 = mapper2.queryUserById(1);
       System.out.println(user2);
       System.out.println(user==user2);

       session2.close();
   }
}
