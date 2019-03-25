public class Printer {
    private int pages = 100;
    private int toner = 100;


    public int pageCount(){
        return this.pages;
    }

    public void print(int numOfPages){
        if(this.pages >= numOfPages && this.toner >= numOfPages){
            this.pages -= numOfPages;
            this.toner -= numOfPages;
        }
    }

    public void refillPages(){
        if(this.pages < 100){
            this.pages = 100;
        }
    }

    public int tonerVolume(){
        return this.toner;
    }

    public void refillToner(){
        if(this.toner < 100){
            this.toner = 100;
        }
    }

}
