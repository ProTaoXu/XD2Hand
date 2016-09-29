<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>XD2HandBookStore</title>
  <link rel="stylesheet" href="../css/normalize.css">
  <link href="https://fonts.googleapis.com/css?family=Changa+One" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">
  <link rel="stylesheet" href="/css/style.css">
  <link rel="stylesheet" href="/css/uploadBooks.css">
  <!-- <link rel="stylesheet" href="../css/responsive.css"> -->
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
   <header>
     <a href="/userManage/loginPage" id="logo">
       <h1>2HandsBookShoop</h1>
     </a>
     <span class="search"><img src="/images/icons/查询.png" alt="" /></span>
  </header>
  <div id="main">
    <div class="left">
      <div class="selfMeaasge">
        <img src="/images/books_images/9780081006603.jpg" alt="" />
        <h3>Susan</h3>
        <p>
          HarringTon
        </p>
      </div>
      <ul>
        <li><a href="#">Dashbord</a></li>
        <li><a href="#">Message</a></li>
        <li><a href="#">Upload Books</a></li>
        <li><a href="#">Calandar</a></li>
      </ul>
      <p class="footMessage">&copy; Copyright 2016 XD2HandBookStore by XDCrater </p>
    </div>

    <div class="right">
      <div class="number">
        <div class="numberSpan">
          <div class="icon icon1">
            <img src="/images/icons/积分.png" alt="" />
          </div>
          <span class="span1">TOTAL SALES</span>
          <p>$65.8</p>
        </div>

        <div class="numberSpan">
          <div class="icon icon2">
            <img src="/images/icons/积分.png" alt="" />
          </div>
          <span class="span2">NEW QUOTE</span>
          <p>$65.8</p>
        </div>

        <div class="numberSpan">
          <div class="icon icon3">
            <img src="/images/icons/积分.png" alt="" />
          </div>
          <span class="span3">ORDERS</span>
          <p>$65.8</p>
        </div>

        <div class="numberSpan">
          <div class="icon icon4">
            <img src="/images/icons/积分.png" alt="" />
          </div>
          <span class="span4">PROUUCTS</span>
          <p>$65.8</p>
        </div>

      </div>
      <h6 color="red" >这里我有个想法，传一本书就要写这么多信息是不现实的，我们需要尽量减少用户写的信息。我们可以利用isbn到书籍的相关信息，然后自动完成大部分表单</h6>
      <form  action="/userAction/publishBook" method="post" enctype="multipart/form-data">
        <table>
        <tr>
          <td>Student ID 这里需要系统生成而不该由用户填写</td>
        </tr>
        <tr>
          <td><form:input path="book.stuId" type="text"  value="" /></td>
        </tr>
        <tr>
          <td>ISBN 这个应该是必填(necessary)</td>
        </tr>
        <tr>
          <td><form:input path="book.isbn" type="text" /></td>
        </tr>
        <tr>
          <td>Title of Book</td>
        </tr>
        <tr>
          <td><form:input path="book.name" type="text" /></td>
        </tr>
        <tr>
          <td>Author 通过isbn查询</td>
        </tr>
        <tr>
          <td><input type="text" /></td>
        </tr>
        <tr>
          <td>Public Date 这里不填</td>
        </tr>
        <tr>
          <td><input type=text /></td>
        </tr>
        <tr>
          <td>Description 是否该写？</td>
        </tr>
        <tr>
          <td><textarea name="name" rows="8" cols="60"></textarea></td>
        </tr>
        <tr>
          <td><button class="btn upload">Upload</button></td>
        </tr>
      </table>
      </form>
      <div class="categories">
        <p>categories</p>
        <select class="form-control">
           <option value="11">CSS</option>
           <option value="12">Javascript</option>
           <option value="13">html</option>
           <option value="14">jquery</option>
        </select>
        <a href="/images/books_images/9780081006603.jpg">
            <img src="/images/books_images/9780081006603.jpg" alt="">
        </a>
        <input class="btn bookCover" type="file" value="Book Cover">
        <p>
          price
        </p>
        <input type="text" name="name" value="">
      </div>
    </div>
 </div>

</body>
</html>
