package BookList;
import java.util.Date ;
public class Book {
private String name ; 
private int pageNum;
private String authorName ;
private int date;
public Book(String name, int pageNum , String authorName , int date) {
	this.name = name ; 
	setPageNum(pageNum);
	setDate(date);
	this.authorName = authorName ;
	
	
}
/**
 * @return the pageNum
 */
public int getPageNum() {
	return pageNum;
}

public void setPageNum(int pageNum) {
	if(pageNum<= 0 ) {
		System.out.println("Page number can't be lesser than zero");
	}
	else {
		this.pageNum = pageNum;
	}
	
}
/**
 * @return the date
 */
public int getDate() {
	return date;
}
/**
 * @param date the date to set
 */
public void setDate(int date) {
	if(date < -3500) {
		System.out.println("Writing hadn't found that date yet  ");
	}else {
		this.date = date;
	}
	
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @return the authorName
 */
public String getAuthorName() {
	return authorName;
}
}
