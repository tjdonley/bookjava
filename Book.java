
public class Book {
	private String name;
	private int numberOfPages;
	private int currentPage;
	
	public Book() {
		name = "No Name Yet";
		numberOfPages = 0;
		currentPage = 0;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
	public void setNumberOfPages(int newNumberOfPages) {
		if (newNumberOfPages > 0 && newNumberOfPages >= currentPage) {
			numberOfPages = newNumberOfPages;	
		}
		
	}
	public int getNumberOfPages() {
		return numberOfPages;
		
	}
	public void setCurrentPage(int newCurrentPage) {
		if(newCurrentPage > 0 && newCurrentPage <= numberOfPages) {
			currentPage = newCurrentPage;
		}
			
	}
	public int getCurrentPage() {
		return currentPage;
	}
	
	

}
