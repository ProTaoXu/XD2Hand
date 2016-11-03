# 创建数据库 默认字符集设置为utf8
CREATE DATABASE IF NOT EXISTS BookStore CHARACTER SET utf8;
USE BookStore;

# 创建用户表
CREATE TABLE IF NOT EXISTS User_Student(
#   用户账号ID
  Stu_id int PRIMARY KEY AUTO_INCREMENT,
#   用户姓名
  name VARCHAR(100) NOT NULL ,
#   昵称
  nickname VARCHAR(100),
#   电话号
  phoneNumber VARCHAR(20),
#   用户邮箱
  email VARCHAR(40),
#   班级
  classes VARCHAR(10),
#   用户头像
  portrait BLOB,
#   账号密码
  passwd VARCHAR(40) NOT NULL
);

-- 图书类型表
CREATE TABLE IF NOT EXISTS Book_TypeInfo(
  BookTypeId int auto_increment primary key,
  BookTypeName varchar(50) not null
);

-- isbn 表
CREATE TABLE IF NOT EXISTS Book_Isbn(
#   isbn 号
  isbn VARCHAR(50) PRIMARY KEY ,
#   图书名称
  Book_name VARCHAR(200)
#   图书的其他信息暂时没写 isbn的信息从哪获得暂时还未知
);

-- 创建图书列表
#  这里有个难点是如何进行分类标识？而且我们有两种分类法方法
CREATE TABLE IF NOT EXISTS Books(
#   图书id
  Book_id INT PRIMARY KEY AUTO_INCREMENT,
#   发布者的id
  Stu_id int,
#   图书 isbn编号
  isbn VARCHAR(50),
#   旧书的图片 需要对个数进行限制。存放的是路径
#   默认第一个为封面，但是前端在进行旧书发布的时候需要区别对待封面图片和详情
  pictures VARCHAR(500),
# 新旧等级  10代表全新 9代表九成新 以此类推
  level int,
#   推荐星级 5代表五星推荐
  recommendStar int,
#   图书发布时间
  publish_date DATE,
#   图书分类编码 通用分类
  BookTypeId int,
#   定制化分了 按照班级分类
  typeCode_class VARCHAR(20),
#   价格
  price float,
#   书名 用户可以字节写书名，默认是和isbn查到的同名。
  name VARCHAR(100),

  FOREIGN KEY (Stu_id) REFERENCES User_Student(Stu_id),
  FOREIGN KEY (BookTypeId) REFERENCES Book_TypeInfo(BookTypeId),
  FOREIGN KEY (isbn) REFERENCES Book_Isbn(isbn)
);

-- 图书评论表
CREATE TABLE IF NOT EXISTS Book_Comment(
#   评论id
  C_id INT PRIMARY KEY AUTO_INCREMENT,
#   发表评论用户id
  Stu_id int,
#   isbn 用isbn来对图书进行分类
  isbn VARCHAR(50),
#   评论内容
  content TEXT,
#   发布评论的时间
  Commentdate datetime,

  foreign key (Stu_id) references User_Student(Stu_id),
#  这个外键约束加不上 一加就有错 
  foreign key (isbn) references Book_Isbn(isbn)
);

-- 订单表
CREATE TABLE IF NOT EXISTS Orders(
  OrderID varchar(20) PRIMARY KEY,
  Stu_id int,
  totalMoney float,
  orderDate datetime,
  foreign key (Stu_id) references User_Student(Stu_id)
);

-- 订单详情
CREATE TABLE IF NOT EXISTS Order_Detail(
  OrderDetailID varchar(20) primary key,
  OrderID varchar(20) not null,
  Book_ID int not null,
  foreign key (OrderID) references Orders(OrderID)
);

-- 插入一些测试用数据
USE BookStore;
INSERT INTO book_isbn VALUES (1,'C++ primer');
INSERT INTO book_typeinfo VALUES (1,'计算机');
INSERT INTO user_student VALUES (1,'张洋','luoyu','15529095223','z_y_ang@163.com','0314','','admin');