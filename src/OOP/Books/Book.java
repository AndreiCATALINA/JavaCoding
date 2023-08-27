package OOP.Books;

public class Book {


        String title;
        public String author;
        private int numberOfPages;
        public int getNumberOfPages(){
          return numberOfPages;
        };

        public void setNumberOfPages(int numberOfPages){
            if(isNumberOfPagesValid(numberOfPages)){
            this.numberOfPages = numberOfPages;
        }else{
                System.out.println("Esti prea jos!");
            }
        }

        private boolean isNumberOfPagesValid(int noOfPages){
            return noOfPages>0;
        };

}
