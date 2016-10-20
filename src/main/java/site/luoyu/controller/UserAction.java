package site.luoyu.controller;





import org.json.JSONException;
import org.json.JSONObject;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import site.luoyu.dao.Books;
import site.luoyu.model.Book;
import site.luoyu.model.User;
import site.luoyu.service.BooksService;
import site.luoyu.util.QueryTool;






import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;



import java.io.IOException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 这个用来实现用户的行为，例如发布图书，浏览图书。查看图书详情等。
 * Created by xd on 2016/9/14.
 */
@Controller
@RequestMapping("/userAction")
public class UserAction {

    private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(UserAction.class);

    @Autowired
    private BooksService booksService;

    /**
     * 返回发布图书页面
     * @param model
     * @return
     *      上传图书页面
     */
    @RequestMapping("/publishBookPage")
    public String getPublishBookPage(Model model){

        Book book = new Book();
        model.addAttribute("book",book);
        return "uploadBooks";
    }

    /**
     * 发布用户图书
     * @throws IOException 
     */
    //todo 这里细作的话需要支持多本书同时发布，我现在只是发不完一本后跳转到发布页面，这样不太好
    @RequestMapping(value = "/publishBook",method = RequestMethod.POST)
    public String publishBookSale(HttpSession session,HttpServletRequest request) throws IOException{
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
        Map<String,MultipartFile> fileMap = multipartHttpServletRequest.getFileMap();
         
        Map BookParameter = multipartHttpServletRequest.getParameterMap();
        
        //在数据库中存放所上传图片的路径信息
        List<String> path = null;       
        
        log.info("用户 发布图书销售信息 ");
        User user = (User) session.getAttribute("user");
        // todo 用户还没有登录，不能发布图书。这里处理的不好，最好是能登录后回到当前页面继续工作
        if(user == null)return "redirect:/userManage/loginPage";
        else {
        	//上传图片封面，并将路径信息保存到数据库
        	 path = booksService.uploadCover(request, user, fileMap); 
            }	
            booksService.publishBook(BookParameter,path,user);
            return "redirect:/userAction/MainPage";
        }

   

    /**
     * 浏览主页面
     * @throws JSONException 
     */
    @RequestMapping("/MainPage")
    public String browseMainPage(HttpServletRequest request/*,
    		@RequestParam(value = "pageNumber",defaultValue="0") Integer pageNumber,
    		@RequestParam(value = "pageSize",defaultValue="12") Integer pageSize,
    		@RequestParam(value = "sortType",defaultValue="auto") String sortType*/) throws JSONException{
        System.out.println("用户浏览主页面，这里需要books表的持久化，将books表中的内容全都列出来");
        System.out.println("图书清单的策略");
         
        
      
       //使用jpa实现分页查询===================================================
        Pageable pageable = QueryTool.buildPageRequest(0, 12, "price");
        /*Pageable pageable = new PageRequest(pageNumber, pageSize,sort);*/
        Page<Books> pages = booksService.getBooksByPage(pageable);
        //=====================================================================
        
        JSONObject json = new JSONObject(pages);
        log.info(json.toString());
        return json.toString();
        
      
        /*return "MainPage";*/
    }

    /**
     * 搜索图书
     * 这里是一个难点，如何分词等问题都值得思考
     */
    @RequestMapping("/searchBooks")
    public void searchBooks(){}
}
