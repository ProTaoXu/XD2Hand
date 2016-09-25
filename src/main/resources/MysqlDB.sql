# 创建数据库 默认字符集设置为utf8
CREATE DATABASE IF NOT EXISTS BookStore CHARACTER SET utf8;
USE BookStore;

# 创建用户表
CREATE TABLE IF NOT EXISTS userStudent(
#   用户账号ID
  Stu_id int PRIMARY KEY ,
#   用户姓名
  name VARCHAR(100),
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
  passwd VARCHAR(40)
);

-- 图书类型表
CREATE TABLE IF NOT EXISTS booktypeinfo(
  BookTypeId int auto_increment primary key,
  BookTypeName varchar(50) not null
);

-- isbn 表
CREATE TABLE IF NOT EXISTS book_isbn(
#   isbn 号
  isbn VARCHAR(50) PRIMARY KEY ,
#   图书名称
  Book_name VARCHAR(200)
#   图书的其他信息暂时没写 isbn的信息从哪获得暂时还未知
);

-- 创建图书列表
#  这里有个难点是如何进行分类标识？而且我们有两种分类法方法
CREATE TABLE IF NOT EXISTS books(
#   图书id
  Book_id INT PRIMARY KEY ,
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
  publish_data DATE,
#   图书分类编码 通用分类
  BookTypeId int,
#   定制化分了 按照班级分类
  typeCode_class VARCHAR(20),
# 价格
  price float,

  FOREIGN KEY (Stu_id) REFERENCES userStudent(Stu_id),
  FOREIGN KEY (BookTypeId) REFERENCES booktypeinfo(BookTypeId),
  FOREIGN KEY (isbn) REFERENCES book_isbn(isbn)
);

-- 图书评论表
CREATE TABLE IF NOT EXISTS bookComment(
#   评论id
  C_id INT PRIMARY KEY ,
#   发表评论用户id
  Stu_id int,
#   isbn 用isbn来对图书进行分类
  isbn VARCHAR(50),
#   评论内容
  content TEXT,
#   发布评论的时间
  Commentdate datetime,

  foreign key (Stu_id) references userStudent(Stu_id),
#  这个外键约束加不上 一加就有错 
  foreign key (isbn) references book_isbn(isbn)
);

-- 订单表
CREATE TABLE IF NOT EXISTS orders(
  OrderID varchar(20) PRIMARY KEY,
  Stu_id int,
  totalMoney float,
  orderDate datetime,
  foreign key (Stu_id) references userStudent(Stu_id)
);

-- 订单详情
CREATE TABLE IF NOT EXISTS OrderDetail(
  OrderDetailID varchar(20) primary key,
  OrderID varchar(20) not null,
  Book_ID int not null,
  foreign key (OrderID) references orders(OrderID)
)