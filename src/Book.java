public class Book {
    private String bid;
    //bianhao
    private String name;
    //shuming
    private String number;
    //shuliang
    private String position;
    //weizhi
    public Book(){
    }
    public Book(String bid, String name, String number, String position){
        this.bid = bid;
        this.name = name;
        this.number = number;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
