public class Book {
    private String bid;

    private String name;

    private Integer number;

    private String position;


    public Book(){
    }
    public Book(String bid, String name, Integer number, String position){
        this.bid = bid;
        this.name = name;
        this.number = Integer.valueOf(number);
        this.position = position;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = Integer.valueOf(number);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }



}
