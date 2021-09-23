import java.util.Date;

public class Book {

    /*

        Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.

        Book sınıfından 10 tane nesne üretip bunu bir ArrayList yapısında saklayınız. stream yapısını ve
    lambda ifadelerini kullanarak kitap isminin karşısında yazar ismi olacak şekilde yeni bir Map<String, String> oluşturacak
    şekilde yazınız.

        Bu 10 elemanlık Book listesinden sayfa sayısı 100'den fazla olan kitapları filtreleyen ve
    yeni bir liste olarak verecek geliştirmeyi yapınız. (Stream ve Lambda ifadeleri kullanabilirsiniz.)*/

    private String name;
    private int pageNumber;
    private String author;
    private Date publishingDate;

    public Book(String name, int pageNumber, String author, Date publishingDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publishingDate = publishingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }
}
