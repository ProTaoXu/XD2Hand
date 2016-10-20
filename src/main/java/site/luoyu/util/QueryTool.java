package site.luoyu.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;



/**
 *ѡ�������ֶ�
 */
public final class QueryTool {
	 //jpa��ѯ
	public static Pageable buildPageRequest(int pageNumber,int pageSize,String sortType){
		Sort sort = null;
		if("bookid".equals(sortType)){
			sort = new Sort(Direction.DESC, "bookid");//Ĭ������
		}else if("price".equals(sortType)){
			sort = new Sort(Direction.DESC, "price");//���۸�����
		}else {
			sort = new Sort(Direction.DESC, "recommendStar");//���Ǽ�����
		}
		return new PageRequest(pageNumber, pageSize, sort);
	}
	
	

}
